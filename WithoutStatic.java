
public class WithoutStatic {
	int count=0;
	
	WithoutStatic() {
		count=count+1;
		System.out.println(count);
	}

	public static void main(String[] args) {
		WithoutStatic w1 = new WithoutStatic();
		WithoutStatic w2 = new WithoutStatic();
		WithoutStatic w3 = new WithoutStatic();

	}

}
