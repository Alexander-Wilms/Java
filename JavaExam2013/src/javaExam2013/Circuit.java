package javaExam2013;

import java.io.Writer;
import java.util.HashMap;

public class Circuit {
	private String name;
	private HashMap<String, Part> myMap; 
	
	public Circuit(String name) {
		this.name = name;
		myMap = new HashMap<String, Part>(); ; 
	}
	
	public String getName() {
		return name;
	}
	
	public void addPart(Part part) {
		myMap.put(part.getName(),part);
	}
	
	public Part getPartByName(String name) {
		return myMap.get(name);
	}
	
	public void dumpParts(Writer writer) {
		for(Object part : myMap.values()) {
			Part thispart = (Part) part;
			thispart.write(writer);
		}
	}
}
