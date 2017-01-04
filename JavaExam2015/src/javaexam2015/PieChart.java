package javaexam2015;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JPanel;

public class PieChart extends JPanel {

	private static final long serialVersionUID = 1L;
	private HashMap<String, Integer> distribution;
	
	public PieChart(HashMap<String, Integer> distribution) {
		this.distribution = distribution;
		Dimension dim = new Dimension();
		dim.setSize(600, 300);
		super.setPreferredSize(dim);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
	    g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON); 
		
		int sum = 0;
		int entries = 0;
		ArrayList<Integer> noofentries = new ArrayList<Integer>();
		
		for (Object value : distribution.values()) {
		sum += (int) value;
		entries++;
		noofentries.add((Integer) value);
		}
		
		ArrayList<String> strings = new ArrayList<String>();
		
		for (Object key : distribution.keySet()) {
			strings.add((String) key);
			}
		
		System.out.println(strings);
		
		int lastpos = 0;
		int startAngle = 0;
		int arcAngle = 0;
		int x = 0;
		
		System.out.println(entries);
		
		for(int i = 0; i < entries; i++) {
			
			System.out.println(noofentries.get(i));
			
			x += (int) ((double) 200/entries); 
			Color myColor = new Color(x, x, x);
			System.out.println("color: " + x);
			g2d.setColor(myColor);
			
			startAngle = lastpos;
			arcAngle = (int) (360 * (double) noofentries.get(i)/sum);

			lastpos = startAngle+arcAngle;
			
			System.out.println("start: " + startAngle);
			System.out.println("end: " + (startAngle + arcAngle));
			
			g2d.fillArc(0, 0, 300, 300, startAngle, arcAngle);
			
			g2d.fillRect(300+10, (i+1)*20, 10, 10);
			Color myStringColor = new Color(0, 0, 0);
			g2d.setColor(myStringColor);
			
			g2d.drawString(strings.get(i), 300+30, (i+1)*20+10);
			
			
		}
	}

}
