
public class CounterbyStaticVar {
	static int count=0;
	CounterbyStaticVar(){
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		CounterbyStaticVar w = new CounterbyStaticVar();
		CounterbyStaticVar w1 = new CounterbyStaticVar();
		CounterbyStaticVar w2 = new CounterbyStaticVar();

	}

}
