class Animal3{
	Animal3(){
		System.out.println("Animal is created...");
	}
}
class Dog3 extends Animal3{
	Dog3(){
		System.out.println("dog is created...");
	}
}
public class TestSuper4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog3 d3=new Dog3();

	}

}
