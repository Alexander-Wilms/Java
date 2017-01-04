package javaExam2013Exercise3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JComponent;

public class ResistorDisplay extends JComponent {

	private static final long serialVersionUID = 1L;
	
	private int divisions;
	private int firstring;
	private int secondring;
	
	public ResistorDisplay(int input) {
		double tmp = input;
		
		divisions = 0;
		
		while(tmp >= 100) {
			tmp /= 10;
			divisions++;
		}
		
		firstring = (int) tmp / 10;
		secondring = (int) tmp % 10;
		
		Dimension dim = new Dimension(70,40);
        super.setPreferredSize(dim);
	}
	
	@Override
    public void paintComponent(Graphics g)
    {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
	    g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON); 
        super.paintComponent(g2);
        
        g2.setColor(getColor(firstring));
        g2.fillRect(10, 10, 20, 20);
        
        g2.setColor(getColor(secondring));
        g2.fillRect(40, 10, 20, 20);
        
        g2.setColor(getColor(divisions));
        g2.fillRect(70, 10, 20, 20);
    }
	
	private Color getColor(int input) {
		System.out.println(input);
		
		switch(input) {
		case 0:
			return Color.black;
		case 1:
			return new Color(156, 93, 82);
		case 2:
			return Color.red;
		case 3:
			return Color.orange;
		case 4:
			return Color.yellow;
		case 5:
			return Color.green;
		case 6:
			return Color.blue;
		case 7:
			return new Color(255, 0, 255);
		case 8:
			return Color.gray;
		case 9:
			return Color.white;
		default:
			return Color.pink;
		}
		}
	}

