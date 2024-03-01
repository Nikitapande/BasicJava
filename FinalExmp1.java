
public class FinalExmp1 {
	final int speed=100;
	void run() {
		speed=400;
	}

	public static void main(String []args) {
		FinalExmp1 f1=new FinalExmp1();
		f1.run();
	}
}
