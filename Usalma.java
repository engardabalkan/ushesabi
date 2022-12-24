import java.util.Scanner;

public class Usalma {

    static int power(int pow, int base) {
        int result = 1;
        for (int i = 1; i <= pow; i++) {
            result *= base;
        }
        System.out.println("Result: " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner mec = new Scanner(System.in);

        int pow;
        do {

            System.out.print("Enter the base value: ");
            int base = mec.nextInt();
            System.out.print("Enter the exponent: ");
            pow = mec.nextInt();
            if (pow >= 0) {
                power(base, pow);
            }
        } while (true);
    }
}