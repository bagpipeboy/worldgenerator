package org.bagpipeboy.worldgenerator;

public class Area {

	private long id;
	private Tile[][] tiles;

	public Area(int width, int height) {
		tiles = new Tile[height][width];
	}

	public void setTile(Tile tile) {
		int x = tile.getX();
		int y = tile.getY();
		tiles[y][x] = tile;
	}

	public Tile getTile(int x, int y) throws Exception {
		try {
			return tiles[y][x];
		} catch (IndexOutOfBoundsException ioobe) {
			throw ioobe;
		}
	}

	public int getWidth() {
		return tiles[0].length;
	}

	public int getHeight() {
		return tiles.length;
	}
	
	public Area copy() {
		return new Area(getWidth(), getHeight());
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Tile[] line : tiles) {
			for (Tile tile : line) {
				sb.append(tile.toString());
			}
			sb.append('\n');
		}
		return sb.toString();
	}
}
