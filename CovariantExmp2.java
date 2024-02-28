class Covariant02{
	Covariant02 foo() {
		return this;
	}
	void print() {
		System.out.println("Inside class Covariant02");
	}
}

class Covariant12 extends Covariant02{
	Covariant12 foo() {
		return this;
	}
	void print() {
		System.out.println("Inside class Covariant12");
	}
}

class Covariant22 extends Covariant12{
	Covariant22 foo() {
		return this;
	}
	void print() {
		System.out.println("Inside class Covariant22");
	}
}


public class CovariantExmp2 {

	public static void main(String[] args) {
		Covariant02 c0=new Covariant02();
		c0.foo().print();
		
		Covariant12 c1=new Covariant12();
		((Covariant12)c1.foo()).print();
		
		Covariant22 c2=new Covariant22();
		((Covariant22)c2.foo()).print();

	}

}
