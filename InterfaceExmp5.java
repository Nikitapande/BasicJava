interface Printable5{
	void print();
}
interface Showable5{
	void print();
}


class InterfaceExmp5 implements Printable5, Showable5{
	public void print() {
		System.out.println("Hello");}

	public static void main(String[] args) {
		InterfaceExmp5 i=new InterfaceExmp5();
		i.print();

	}

}
