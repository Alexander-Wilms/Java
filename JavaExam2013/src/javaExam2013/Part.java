package javaExam2013;

import java.io.IOException;
import java.io.Writer;

public abstract class Part {
	private String name;
	private double value;
	
	public Part() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	abstract String getUnit();
	
	public void write(Writer writer) {
		try {
			writer.write(this.getName() + ": " + this.getValue() + this.getUnit() + '\n');
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
