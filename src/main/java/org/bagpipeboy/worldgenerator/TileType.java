package org.bagpipeboy.worldgenerator;

public enum TileType {
	PLAINSLAND('_'), WOODS('W'), LAKE('~');
	
	private TileType(char identifier) {
		this.identifier = identifier;
	}
	
	private char identifier;
	
	public String toString() {
		return String.valueOf(identifier);
	}
}
