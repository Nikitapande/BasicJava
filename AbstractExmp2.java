abstract class Shapee{
	abstract void draw();
}

class rectt extends Shapee{
	void draw() {
		System.out.println("drawing rectangle...");}}

class circ extends Shapee{
	void draw() {
		System.out.println("drawing circle...");}}

public class AbstractExmp2 {

	public static void main(String[] args) {
		Shapee s=new circ();
		s.draw();

	}

}
