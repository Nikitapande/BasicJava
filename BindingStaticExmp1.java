class StatExmp1{
	private void eat() {
		System.out.println("dog is eating...");
	}
}
public class BindingStaticExmp1 {

	public static void main(String[] args) {
		StatExmp1 s=new StatExmp1();
		s.eat();
	}

}
