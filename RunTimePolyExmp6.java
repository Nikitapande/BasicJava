class Animal03{
	void eat() {
		System.out.println("animal is eating..");}}

class Dog03 extends Animal03{
	void eat() {
		System.out.println("dog is eating..");}}

public class RunTimePolyExmp6 extends Dog03{

	public static void main(String[] args) {
		Animal03 a=new RunTimePolyExmp6();
		a.eat();

	}

}
