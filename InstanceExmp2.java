class IntA2{
	IntA2(){
		System.out.println("parent class constructor invoked..");	}}

public class InstanceExmp2 extends IntA2{
	InstanceExmp2(){
		super();
		System.out.println("Child class constructor invoked..");}
	InstanceExmp2(int a){
		super();
		System.out.println("child class constructor invoked "+a);
	}
	
	{System.out.println("Instance Initializer block is invoked");}

	public static void main(String[] args) {
		InstanceExmp2 i1=new InstanceExmp2();
		InstanceExmp2 i2= new InstanceExmp2(10);

	}

}
