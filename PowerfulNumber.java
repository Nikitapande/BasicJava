import java.util.Vector;

public class PowerfulNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (isPowerfulNo(i)) {
                System.out.println("The number " + i + " is the powerful number.");
            } else {
                System.out.println("The number " + i + " is not the powerful number.");
            }
        }
    }

    public static boolean isPowerfulNo(int num) {
        Vector<Integer> primeFactors = new Vector<>();

        // Find prime factors of num
        while (num % 2 == 0) {
            primeFactors.add(2);
            num /= 2;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                primeFactors.add(i);
                num /= i;
            }
        }
        if (num > 2) {
            primeFactors.add(num);
        }

        // Check if the square of all prime factors divides num
        for (int factor : primeFactors) {
            if (num % (factor * factor) != 0) {
                return false;
            }
        }
        return true;
    }
}
