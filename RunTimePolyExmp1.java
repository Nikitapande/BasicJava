class PolyEmp1{
	void run() {
		System.out.println("running..");}}

public class RunTimePolyExmp1 extends PolyEmp1{
	void run() {
		System.out.println("running safely..");
	}
	
	public static void main(String[] args) {
		PolyEmp1 r=new RunTimePolyExmp1();
		r.run();

	}

}
