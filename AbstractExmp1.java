abstract class BikeAb{
	abstract void run();
}

public class AbstractExmp1 extends BikeAb{
	void run() {
		System.out.println("running Safely");}

	public static void main(String[] args) {
		BikeAb obj=new  AbstractExmp1();
		obj.run();

	}

}
