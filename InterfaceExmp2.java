interface Drawable{
	void draw();
}
class Rect implements Drawable{
	public void draw() {
		System.out.println("drawing rect..");
	}
}
class Cir implements Drawable{
	public void draw() {
		System.out.println("drawing cicl..");
	}
}
public class InterfaceExmp2 {

	public static void main(String[] args) {
		Drawable d=new Cir();
		d.draw();

	}

}
