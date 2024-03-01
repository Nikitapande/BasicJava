class Bank1{
	float getRateOfInterest() { return 0;}
}
class SBI1 extends Bank1{
	float getRateOfInterest() { return 8.4f;}
}
class ICICI1 extends Bank1{
	float getRateOfInterest() {return 7.3f;	}
}

class Axis1 extends Bank1{
	float getRateOfInterest() {return 9.7f;	}
}

public class BankRunTime {

	public static void main(String[] args) {
		Bank1 b;
		b=new SBI1();
		System.out.println("SBI  Rate of Interest: "+b.getRateOfInterest());
		b=new ICICI1();
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
		b=new Axis1();
		System.out.println("Axis Rate of Interest: "+b.getRateOfInterest());

	}

}
