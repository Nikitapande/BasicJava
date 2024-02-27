class A5{
	A5 getA5() {
		return this;
	}
	void msg() {
		System.out.println("Hello Java");
	}
}
public class thisExamp6 {

	public static void main(String[] args) {
		new A5().getA5().msg();

	}

}
