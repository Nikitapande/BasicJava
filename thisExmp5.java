class B{
	thisExamp5 obj;
	B(thisExmp5 obj){
		this.obj=obj;
	}
	void display() {
		System.out.println(obj.data);
	}
	
}
public class thisExmp5 {
	int data=10;
	thisExmp5(){
		B b=new B(this);
		b.display();
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		thisExmp5 t1=new thisExmp5();
	}

}
