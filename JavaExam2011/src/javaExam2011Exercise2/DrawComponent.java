package javaExam2011Exercise2;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DrawComponent extends Component {

	private static final long serialVersionUID = 1L;
	private List<Point> pointList;
	
	public DrawComponent() {
		Dimension dim = new Dimension(300,300);
		super.setPreferredSize(dim);
		pointList = new ArrayList<Point>();
		
		File file = new File("data.txt");
		
		try {
			Scanner myScanner = new Scanner(file);
			String input = null;
			String buffer = null;
			Point myPoint;
			Integer x,y;
			String[] bufferArray; 
			if(myScanner.hasNextLine())
				input = myScanner.nextLine();
			StringTokenizer st = new StringTokenizer(input);
			while(st.hasMoreTokens()) {
				buffer = st.nextToken();
				System.out.println(buffer);
				myPoint = new Point();
				bufferArray = buffer.split("\\,");
				x = new Integer(bufferArray[0]);
				y = new Integer(bufferArray[1]);
				myPoint.setLocation(x, y);
				pointList.add(myPoint);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
	    g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON); 
		for(int i = 0; i < pointList.size()-1; i++) {
			g2.drawLine((int) pointList.get(i).getX(), (int) pointList.get(i).getY(), (int) pointList.get(i+1).getX(), (int) pointList.get(i+1).getY());
		}
		
	}
}
