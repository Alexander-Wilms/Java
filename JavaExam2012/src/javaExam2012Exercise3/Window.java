package javaExam2012Exercise3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class Window extends JComponent implements MouseListener {
	
	private static final long serialVersionUID = 1L;
	private int x, y, colorIndex = 0;
	
	public Window() {
		Dimension dim = new Dimension(300, 300);
		super.setPreferredSize(dim);
		addMouseListener(this);
	}
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
	    g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON); 
		
	    
        g2.setColor(getColor(colorIndex));
        colorIndex++;
        colorIndex %= 3;
        g2.fillOval(x-10, y-10, 20, 20);
    }
	
	private Color getColor(int index) {
		switch(index) {
		case 0:
			return Color.red;
		case 1:
			return Color.green;
		case 2:
			return Color.yellow;
		default:
			return Color.black;
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
		x = e.getX();
		y = e.getY();
		this.repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
