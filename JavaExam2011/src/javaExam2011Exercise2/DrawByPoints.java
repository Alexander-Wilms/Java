package javaExam2011Exercise2;

import java.awt.Component;

import javax.swing.JFrame;

public class DrawByPoints {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		Component myComponent = new DrawComponent();
		
		jf.add(myComponent);
		
		jf.pack();
		
		jf.setVisible(true);

	}

}
