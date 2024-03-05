interface Drawable7{
	void draw();
	default void msg(){
		System.out.println("default method");
	}
}
class RectInt7 implements Drawable7{
	public void draw() {
		System.out.println("drawing rectangle..");
	}
}
public class InterfaceExmp7 {

	public static void main(String[] args) {
		Drawable7 d= new RectInt7();
		d.draw();
		d.msg();

	}

}
