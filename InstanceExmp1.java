class Ai1{
	Ai1(){
		System.out.println("parent class constructor invoked... ");
	}
}
public class InstanceExmp1 extends Ai1{
	InstanceExmp1(){
		super();
		System.out.println("child class...");}
	
	{System.out.println("Instance intializer block is invoked...");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceExmp1 i=new InstanceExmp1();
	}

}
