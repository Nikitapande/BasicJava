interface Printable{}

class AA1 implements Printable{
	public void aa1() {
		System.out.println("aa method");}
}

class BB1 implements Printable{
	public void bb1() {
		System.out.println("bb method");}}

class Call{
	void invoke(Printable p){ //upcasting
		if(p instanceof AA1) {
			AA1 a= (AA1) p; //downcasting
			a.aa1();}
		if(p instanceof BB1) {
			BB1 b=(BB1) p;
			b.bb1();
		}
	}
}

public class Instanceofexmp {
	public static void main(String []args) {
		Printable p =new BB1();
		Call c=new Call();
		c.invoke(p);
	}
}
