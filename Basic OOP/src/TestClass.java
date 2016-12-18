public class TestClass {
	
	private static int attribute;
	
	public TestClass()
	{
		System.out.println("TestObject created");
		attribute = 0;
	}
	
	public void increase() {
		attribute++;
	}
	
	public int getAttribute() {
		return attribute;
	}
	
	public void printAttribute() {
		System.out.println(attribute);
	}
}