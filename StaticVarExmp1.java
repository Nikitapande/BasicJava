class Student 
{
	int rollno;

	String name;
	static String college = "ITS";
	
	Student(int r, String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class StaticVarExmp1 {
	
	public static void main(String[] args) {
		Student s1= new Student(101, "demo1");
		Student s2= new Student(222, "demo2");
		s1.display();
		s2.display();

	}

}
