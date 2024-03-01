class Animal01{
	void eat() {
		System.out.println("Eating..."); }}

class Dog01 extends Animal01{
	void eat() {
		System.out.println("Eating Bread...");}}

class Cat1 extends Animal01{
	void eat() {
		System.out.println("Eating Rat...");}}

class Lion1 extends Animal01{
	void eat() {
		System.out.println("Eating Meat...");}}

public class RunTimePolyExmp3 {

	public static void main(String[] args) {
		Animal01 a;
		a=new Dog01();
		a.eat();
		
		a=new Cat1();
		a.eat();
		
		a=new Lion1();
		a.eat();
	}

}
