package com.techlab.model;

import java.util.*;

public class Folder implements StorageItem {
	private String name;
	private List<StorageItem> child;
	private int depth;
	private StringBuilder str = new StringBuilder();

	public Folder(String name) {
		this.name = name;
		this.child = new ArrayList<StorageItem>();
		this.depth = 0;
	}

	public void addChild(StorageItem s) {
		s.setDepth(this.getDepth() + 1);
		this.child.add(s);
	}

	@Override
	public String display() {
		for(int i = 0; i < depth; i++) 
			str.append("    ");
		this.str.append(str+"Folder Name: "+this.name);
		this.str.append(System.getProperty("line.separator"));
		for(StorageItem s : this.child) {
			this.str.append(s.display());
		}
		return str.toString();
	}

	public String getName() {
		return name;
	}

	public List<StorageItem> getChild() {
		return child;
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
