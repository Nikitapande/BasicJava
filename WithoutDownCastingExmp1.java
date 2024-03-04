class WithoutDownCast1{}
public class WithoutDownCastingExmp1 extends WithoutDownCast1{

	static void method(WithoutDownCast1 a) {
		WithoutDownCastingExmp1 w=(WithoutDownCastingExmp1) a;
		System.out.println("Ok performed downCasting...");
	}
	public static void main(String[] args) {
		WithoutDownCast1 w=new WithoutDownCastingExmp1();
		//WithoutDownCast1 w=new WithoutDownCast1(); //Run-time error
		WithoutDownCastingExmp1.method(w);

	}

}
