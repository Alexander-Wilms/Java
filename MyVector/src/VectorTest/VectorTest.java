// https://www.cl.cam.ac.uk/teaching/1213/OOProg/Files/OOP_Harle_Examples_1213.pdf
// Exercise 12

package VectorTest;

public class VectorTest {

	public static void main(String[] args) {
		Vector2D myVector = new Vector2D(1,2);
		Vector2D myOtherVector = new Vector2D(3,4);
		
		System.out.println(myVector);

		System.out.println(myVector.scalarProduct(myOtherVector));
		
		System.out.println(myVector.vectorProduct(myOtherVector));
		
		System.out.println(myVector.magnitude());
		
		myVector.normalize();
		
		System.out.println(myVector);
		
		System.out.println(myVector.magnitude());
		
	}
}
