interface Printable4{
	void print();
}

interface Showable4{
	void show();
}
public class InterfaceExmp4 implements Printable4, Showable4{
	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
	
	public static void main(String args[]) {
		InterfaceExmp4 i=new InterfaceExmp4();
		i.print();
		i.show();
	}

}
