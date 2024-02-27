import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		findEvenOdd(num);
	}

	public static void findEvenOdd(int n) {
		if(n%2==0) {
			System.out.println("Entered number is even: "+n);
		}
		else {
			System.out.println("Entered number is odd: "+n);
		}
	}
}
