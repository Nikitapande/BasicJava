class Animal02{
	void eat() {
		System.out.println("Eating..");	}
}
class Dog02 extends Animal02{
	void eat() {
		System.out.println("Eating Fruits");}
}

public class RunTimePolyExmp5 extends Dog02{
	void eat() {
		System.out.println("Drinking milk");}

	public static void main(String[] args) {
		Animal02 a1,a2,a3;
		a1=new Animal02();
		a2=new Dog02();
		a3=new RunTimePolyExmp5();
		a1.eat();
		a2.eat();
		a3.eat();

	}

}
