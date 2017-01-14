import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Display extends Component {
	
	private boolean[][] data;
	
	Graphics2D g2;
	
	Graphics g;
	
	public Display() {
		Dimension dim = new Dimension(100,100);
		super.setPreferredSize(dim);
	}

	public void setdata(boolean[][] input) {
		data = input;
	}
	
	@Override
	public void paint(Graphics g) {
		g2 = (Graphics2D) g;
		
		for(int i = 0; i <100; i++) {
			for(int j = 0; j < 100; j++) {
				if(data[i][j] == true) {
					g2.fillRect(i,99-j,1,1);
				}
			}
		}
	}
	
	public Graphics getGraphics() {
		return g;
	}
	
	

}
