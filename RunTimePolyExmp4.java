class Bike22{
	int speedlimit=200;
}
public class RunTimePolyExmp4 extends Bike22{
	int speedlimit=600;

	public static void main(String[] args) {
		Bike22 b=new RunTimePolyExmp4();
		System.out.println(b.speedlimit);

	}

}
