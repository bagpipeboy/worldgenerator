package org.bagpipeboy.worldgenerator;

public class AreaFactory {

	public static Area generate(int width, int height) {
		return new Area(width, height);
	}

	public static void populate(Area area, TileType basicTiletype) {
		for (int x = 0; x < area.getWidth(); x++) {
			for (int y = 0; y < area.getHeight(); y++) {
				Tile t = new Tile(basicTiletype, x, y);
				area.setTile(t);
			}
		}
	}
	
	public static void modify(Area area, TileType tileType, int x, int y) {
		Tile tile = new Tile(tileType, x, y);
		area.setTile(tile);
		System.out.println(area.toString());
	}
}
