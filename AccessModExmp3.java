class AccMod3{
	protected void msg() {
		System.out.println("hello java");	}
}
public class AccessModExmp3 extends AccMod3{
	/*void msg() {
		System.out.println("Hello java");
	} */

	public static void main(String[] args) {
		AccessModExmp3 a=new AccessModExmp3();
		a.msg();

	}

}
