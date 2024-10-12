import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Inches to Centimetres");
        System.out.println("4. Centimetres to Inches");
        System.out.println("5. Pounds to Kilograms");
        System.out.println("6. Kilograms to Pounds");

        System.out.print("Please enter the index of the converter you desire: ");
        int index = scanner.nextInt();

        if (index == 1) {
            System.out.print("Please enter the temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double convertCelsius = (9 * celsius) / 5;
            System.out.println(convertCelsius + 32 + " Degrees Fahrenheit");
        } else if (index == 2) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            System.out.println((fahrenheit - 32) * 5 / 9 + " Degrees Celsius");
        } else if (index == 3) {
            System.out.print("Please enter the length in Inches: ");
            double inches = scanner.nextDouble();
            System.out.println(inches * 2.54 + "cm");
        } else if (index == 4) {
            System.out.print("Please enter the length in centimetres: ");
            double cm = scanner.nextDouble();
            System.out.println(cm / 2.54 + " inches");
        } else if (index == 5) {
            System.out.print("Please enter the weight in pounds: ");
            double pounds = scanner.nextDouble();
            System.out.println(pounds / 2.2 + "kg");
        } else if (index == 6) {
            System.out.print("Please enter the weight in kilograms: ");
            double pounds = scanner.nextDouble();
            System.out.println(pounds * 2.2 + "lb");
        }
        scanner.close();
    }
}