interface Aint1{
	void a();
	void b();
	void c();
	void d();
}

abstract class Bint1 implements Aint1{
	public void c() {
		System.out.println("I am C");}}

class Mint1 extends Bint1{
	public void a() {System.out.println("I am a");}
	public void b() {System.out.println("I am b");}
	public void d() {System.out.println("I am d");}
}

public class AbstractInterfaceExmp1 {

	public static void main(String[] args) {
		Aint1 a=new Mint1();
		a.a();
		a.b();
		a.c();
		a.d();

	}

}
