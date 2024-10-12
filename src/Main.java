import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 3 numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        if (num1 < num2 && num1 < num3) {
            System.out.println("The lowest number entered was " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("The lowest number entered was " + num2);
        } else if (num3 < num2 && num3 < num1) {
            System.out.println("The lowest number entered was " + num3);
        }

        scanner.close();
    }
}