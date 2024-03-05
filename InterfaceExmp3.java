interface Bankk{
	float getInterest();
}
class SBII implements Bankk{
	public float getInterest() {
		return 9.15f;}
}
class PNBB implements Bankk{
	public float getInterest() {
		return 8.15f;
	}
}
public class InterfaceExmp3 {

	public static void main(String[] args) {
		Bankk b= new SBII();
		System.out.println("ROI: "+b.getInterest());

	}

}
