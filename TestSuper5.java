class Person{
	int id;
	String name;
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
}

class Emp extends Person{
	float sal;
	
	Emp(int id, String name, float sal){
		super(id,name);
		this.sal=sal;
	}
	void display() {
		System.out.println(id+" "+name+" "+sal);
	}
}
public class TestSuper5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp(1,"User1",100f);
		e1.display();

	}

}
