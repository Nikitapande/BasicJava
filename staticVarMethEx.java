
public class staticVarMethEx {
	int rollno;
	String name;
	static String college = "TLS";
	
	static void change() {
		college ="BTLS";
	}
	
	staticVarMethEx(int r, String n){
		rollno=r;
		name=n;
	}
	
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args) {
		staticVarMethEx.change();
		staticVarMethEx s1=new staticVarMethEx(101, "User1");
		staticVarMethEx s2=new staticVarMethEx(102, "User2");
		
		s1.display();
		s2.display();
	}

}
