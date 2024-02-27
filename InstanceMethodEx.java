
public class InstanceMethodEx {

	public static void main(String[] args) {
		InstanceMethodEx obj= new InstanceMethodEx();
		System.out.println("The sum is: "+ obj.add(12,13));

	}
	int s;
	
	public int add(int a,int b) {
		s=a+b;
		return s;
	}

}
