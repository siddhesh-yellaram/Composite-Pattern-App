package com.techlab.test;

import com.techlab.model.File;
import com.techlab.model.Folder;

public class CompositePatternTest {

	public static void main(String[] args) {
		Folder root = new Folder("Movies");
		root.addChild(new File("Inferno",2,"mkv"));
		root.addChild(new File("Angels & Demons",1,"mkv"));
		
		Folder comedy = new Folder("Comedy Movies");
		root.addChild(comedy);
		comedy.addChild(new File("Friends",4,"mkv"));
		comedy.addChild(new File("Zoolander",2,"mkv"));
		
		Folder games = new Folder("Games");
		root.addChild(games);
		games.addChild(new File("God Of War",20,"exe"));
		games.addChild(new File("Sekiro",20,"exe"));
		
		root.addChild(new File("The Da Vinci Code",2,"mkv"));
		
		Folder newFolder = new Folder("New Folder");
		root.addChild(newFolder);
		newFolder.addChild(new File("Toy Story",2,"mkv"));
		
		System.out.println(root.display());
	}

}
