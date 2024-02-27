class classV{
	int roll;
	String name,course;
	float fee;


classV(int roll,String name, String course){
	this.roll=roll;
	this.name=name;
	this.course=course;
}

classV(int roll, String name,String course, float fee){
	this(roll,name,course);
	this.fee=fee;
}

void display() {
	System.out.println(roll+" "+name+" "+course+" "+fee);
}
}
public class thisExmp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classV v1=new classV(111,"user1","Java");
		classV v2=new classV(112,"user2","Python",200f);
		v1.display();
		v2.display();

	}

}
