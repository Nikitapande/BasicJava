class downCast1{}

class downCastingExmp1 extends downCast1 {

	static void method(downCast1 a) {
		if(a instanceof downCastingExmp1) {
			downCastingExmp1 d=(downCastingExmp1) a;
			System.out.println("Ok downcasting performed");
		}
	}
	public static void main(String[] args) {
		downCast1 a=new downCastingExmp1();
		downCastingExmp1.method(a);

	}

}
