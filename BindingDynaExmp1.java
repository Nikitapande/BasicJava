class dynaEmp1{
	void eat() {
		System.out.println("animal is eating...");
	}
}
public class BindingDynaExmp1 extends dynaEmp1{
	void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dynaEmp1 d= new BindingDynaExmp1();
		d.eat();

	}

}
