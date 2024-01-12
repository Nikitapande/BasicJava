
public class ControlStatementExmp3 {
	public static void main(String args[]) {
		String address = "Delhi, India";
		
		if(address.endsWith("India")) {
			if(address.contains("Meerut")) {
				System.out.print("Your city is Meerut");
			}
			else if(address.contains("Vadorada")) {
				System.out.print("Your city is Vadorada");
			}
		/*	else if(address.contains("Delhi")) {
				System.out.print("Your city is Delhi");
			} */
			else {
				System.out.print(address.split(",")[0]);
			}
		}
		else {
			System.out.print("You are not living in India");
		}
	}
}
