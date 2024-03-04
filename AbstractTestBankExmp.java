abstract class bankinfoAbs{
	abstract int getRateOFInterest();
}

class BBI extends bankinfoAbs{
	int getRateOFInterest() {
		return 7;
	}
}

class PNB extends bankinfoAbs{
	int getRateOFInterest() {
		return 9;
	}
}
public class AbstractTestBankExmp {

	public static void main(String[] args) {
		bankinfoAbs b;
		b=new BBI();
		System.out.println("Rate of Interest is: "+b.getRateOFInterest()+"%");
		b=new PNB();
		System.out.println("Rate of Interest is: "+b.getRateOFInterest()+"%");

	}

}
