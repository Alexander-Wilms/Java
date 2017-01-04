package javaExam2012Exercise3;

import java.awt.Component;

import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		Component myWindow = new Window();
		
		jf.add(myWindow);
		
		jf.pack();
		
		jf.setVisible(true);
	}

}
