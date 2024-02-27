class Covariant1{
	Covariant1 get() {
		return this;
	}
}
public class CovariantExmp1 extends Covariant1{
	CovariantExmp1 get() {
		return this;}
	
	void msg() {
		System.out.println("Welcome to covariant return type");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CovariantExmp1().get().msg();

	}

}
