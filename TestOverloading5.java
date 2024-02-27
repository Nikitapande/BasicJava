
public class TestOverloading5 {
	void sum(int a, int b) {
		System.out.println("int arg invoked");
	}
	void sum(long a, long b) {
		System.out.println("long arg invoked");
	}

	public static void main(String[] args) {
		TestOverloading5 t = new TestOverloading5();
		//t.sum(20, 0);
		t.sum(214748364, 214748364 );

	}

}
