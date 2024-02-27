
public class copyConstructorExmp2 {
	int id;
	String name;
	copyConstructorExmp2(int i, String n){
		id=i;
		name=n;
	}
	copyConstructorExmp2(){}
	void display() {
		System.out.println(id+" "+name);
		
	}

	public static void main(String[] args) {
		copyConstructorExmp2 c1= new copyConstructorExmp2(10001, "User10001");
		copyConstructorExmp2 c2= new copyConstructorExmp2();
		c2.id=c1.id;
		c2.name=c1.name;
		c1.display();
		c2.display();
	}

}
