interface printable1{
	void print();
}

class A6 implements printable1{
	public void print() {
		System.out.println("Hello..");}
}
public class InterfaceExmp1 {

	public static void main(String[] args) {
		A6 obj = new A6();
		obj.print();

	}

}
