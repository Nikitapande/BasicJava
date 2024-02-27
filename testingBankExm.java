class Bank{
	int getRateOfInterest() {return 0;}
}
class SBI extends Bank{
	int getRateOfInterest() {return 8;}
}
class  ICICI extends Bank{
	int getRateOfInterest() {return 7;}
}
class Axis extends Bank{
	int getRateOfInterest() {return 9;}
}
public class testingBankExm {

	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI i=new ICICI();
		Axis a=new Axis();
		System.out.println("Rate of Interest SBI: "+s.getRateOfInterest());
		System.out.println("Rate of Interest ICICI: "+i.getRateOfInterest());
		System.out.println("Rate of Interest Axis: "+a.getRateOfInterest());

	}

}
