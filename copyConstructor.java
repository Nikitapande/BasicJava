
public class copyConstructor {
	int id;
	String name;
	
	copyConstructor(int i, String n) {
		id=i;
		name=n;
	}
	
	copyConstructor(copyConstructor c) {
		id=c.id;
		name=c.name;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		copyConstructor o1= new copyConstructor(1112,"Test user");
		copyConstructor o2= new copyConstructor(o1);
		o2.display();
		o1.display();

	}

}
