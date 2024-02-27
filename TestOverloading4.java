
public class TestOverloading4 {
	void sum(int a, long b) { 
		System.out.println(a+b);}
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);}
	
	public static void main(String args[]) {
		TestOverloading4 o4=new TestOverloading4();
		o4.sum(20, 200);
		o4.sum(10,20,20);
	}

}
