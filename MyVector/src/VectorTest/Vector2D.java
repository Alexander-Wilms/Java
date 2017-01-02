package VectorTest;
public class Vector2D {
		private double x, y;
		
		public Vector2D(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public void add(Vector2D arg) {
			this.x += arg.getx();
			this.y += arg.gety();
		}
		
		public double getx() {
			return this.x;
		}
		
		public double gety() {
			return this.y;
		}
		
		public double magnitude() {
			return Math.sqrt(Math.pow(x,2.)+Math.pow(y,2.));
		}
		
		public void normalize() {
			double mag = magnitude();
			x /= mag;
			y /= mag;
		}
		
		public double scalarProduct(Vector2D input) {
			return this.x*input.getx()+this.y*input.gety();
		}
		
		public double vectorProduct(Vector2D input) {
			return this.x*input.gety()-input.getx()*this.y;
		}
		
		@Override
		  public String toString()
		  {
		    return "("+x+", "+y+")";
		  }
	}