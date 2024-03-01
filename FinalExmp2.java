class Finl1{
	final void run() {
		System.out.println("running...");}
}

public class FinalExmp2 extends Finl1{
	void run() {
		System.out.println("running safely...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalExmp2 f1=new FinalExmp2();
		f1.run();

	}

}
