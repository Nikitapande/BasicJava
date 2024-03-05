//Interface Inheritance
interface Printable6{
	void print();
}
interface Showable6 extends Printable6{
	void show();
}
public class InterfaceExmp6 implements Showable6{
	public void print() {
		System.out.println("Hello...");
	}
	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		InterfaceExmp6 i=new InterfaceExmp6();
		i.print();
		i.show();

	}

}
