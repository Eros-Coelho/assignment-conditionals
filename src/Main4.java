import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number between 1 and 999: ");
        int number = scanner.nextInt();

        if (number < 1000 && number >= 100) {
            System.out.println("0" + number);
            System.out.println("The original number had 3 digits");
        } else if (number < 100 && number >= 10) {
            System.out.println("00" + number);
            System.out.println("The original number had 2 digits");
        } else if (number < 10) {
            System.out.println("000" + number);
            System.out.println("The original number had 1 digit");
        }

        scanner.close();

    }
}