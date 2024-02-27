class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}
public class TestOveridding2 extends Vehicle{

	void run() {
		System.out.println("Bike is running");}
	
	public static void main(String[] args) {
		TestOveridding2 t2=new TestOveridding2();
		t2.run();

	}

}
