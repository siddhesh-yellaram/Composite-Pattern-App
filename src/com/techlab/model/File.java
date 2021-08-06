package com.techlab.model;


public class File implements StorageItem{
	private String name;
	private int size;
	private String type;
	private int depth;
	private StringBuilder str = new StringBuilder();
	
	
	public File(String name, int size, String type) {
		this.name = name;
		this.size = size;
		this.type = type;
	}

	@Override
	public String display() {
		for(int i = 0; i < depth; i++) 
			this.str.append("	");
		this.str.append("File Name: "+this.name+"."+this.type);
		this.str.append(System.getProperty("line.separator"));
		return str.toString();
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public String getType() {
		return type;
	}
	
	@Override
	public int getDepth() {
		return this.depth;
	}

	@Override
	public void setDepth(int depth) {
		this.depth=depth;
	}
	
}
