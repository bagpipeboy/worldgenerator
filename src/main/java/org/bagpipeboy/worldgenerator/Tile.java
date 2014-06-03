package org.bagpipeboy.worldgenerator;

public class Tile {
	
	private long id;
	private long areaId;
	
	private int x;
	private int y;
	private TileType type;
	
	public Tile (TileType type, int x, int y) {
		this.type = type;
		this.x = x;
		this.y = y;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public long getAreaId() {
		return areaId;
	}
	public void setAreaId(long areaId) {
		this.areaId = areaId;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public TileType getType() {
		return type;
	}
	public void setType(TileType type) {
		this.type = type;
	}
	
	public String toString() {
		return this.type.toString();
	}
}
