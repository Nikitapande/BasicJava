abstract class Bikee1{
	Bikee1(){
		System.out.println("bike is created..");}
	abstract void run();
	
	void changeGear(){
		System.out.println("gear changed..");}}

class Hondaa1 extends Bikee1{
	void run() {
		System.out.println("running safely");}
}
public class AbstractExmp3 {

	public static void main(String[] args) {
		Bikee1 b1=new Hondaa1();
		b1.run();
		b1.changeGear();

	}

}
