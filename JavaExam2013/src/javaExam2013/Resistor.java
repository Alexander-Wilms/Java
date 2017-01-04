package javaExam2013;

public class Resistor extends Part {

	public Resistor(String name, double value) {
		super.setName(name);
		super.setValue(value);
	}
	
	@Override
	String getUnit() {
		return "Ohm";
	}

}
