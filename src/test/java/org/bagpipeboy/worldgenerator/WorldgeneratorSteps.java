package org.bagpipeboy.worldgenerator;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.de.Angenommen;
import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Wenn;

public class WorldgeneratorSteps {
	
	private Area area;
	
	@Angenommen("^die Welt ist auf (\\d+) x (\\d+) Felder begrenzt$")
	public void die_Welt_ist_auf_x_Felder_begrenzt(int width, int height) throws Throwable {
	    area = new Area(width, height);
	}

	@Wenn("^ich ein[en]{0,2} \"(.*?)\" generiere$")
	public void ich_eine_generiere(String fieldType) throws Throwable {
	    AreaFactory.populate(area, TileTypeTranslator.translate(fieldType));
	}

	@Dann("^(?:hat die Karte )?(\\d+) Feld(?:er)? \"(.*?)\"$")
	public void hat_die_Karte_Felder(int numberOfFieldsOfType, String fieldType) throws Throwable {
		int count = 0;
	    for (int x = 0; x < area.getWidth(); x++) {
	    	for (int y = 0; y < area.getHeight(); y++) {
	    		if (area.getTile(x, y).getType().equals(TileTypeTranslator.translate(fieldType))) {
	    			count++;
	    		}
	    	}
	    }
	    assertEquals(numberOfFieldsOfType, count);
	}
	
	@Wenn("^ich auf (\\d+)/(\\d+) einen kleinen See generiere$")
	public void ich_auf_einen_kleinen_See_generiere(int x, int y) throws Throwable {
		AreaFactory.modify(area, TileType.LAKE, x, y);
	}
	
	private static class TileTypeTranslator {
		public static TileType translate(String german) {
			switch (german) {
			case "Wald": return TileType.WOODS;
			case "See": return TileType.LAKE;
			case "Grasland": return TileType.PLAINSLAND;
			default: throw new IllegalArgumentException(german + " is not a recognized TileType");
			}
		}
	}
}
