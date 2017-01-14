import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Display extends Component {
	
	private static final long serialVersionUID = 1L;

	private boolean[][] data;
	
	Graphics2D g2;
	
	Graphics g;
	
	int size;
	
	public Display(int size) {
		this.size = size;
		Dimension dim = new Dimension(size,size);
		super.setPreferredSize(dim);
		data = new boolean[size][size];
	}

	public void setdata(boolean[][] data2) {
		data = data2;
	}
	
	@Override
	public void paint(Graphics g) {
		g2 = (Graphics2D) g;
		
		for(int i = 0; i <size; i++) {
			for(int j = 0; j < size; j++) {
				if(data[i][j] == true) {
					g2.fillRect(i,j,1,1);
				}
			}
		}
	}
	
	public Graphics getGraphics() {
		return g;
	}
	
	

}
