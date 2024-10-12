import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three different characters:");
        char char1 = scanner.next().charAt(0);
        char char2 = scanner.next().charAt(0);
        char char3 = scanner.next().charAt(0);

        char first, second, third;

        if (char1 < char2 && char1 < char3) {
            first = char1;
            if (char2 < char3) {
                second = char2;
                third = char3;
            } else {
                second = char3;
                third = char2;
            }
        } else if (char2 < char1 && char2 < char3) {
            first = char2;
            if (char1 < char3) {
                second = char1;
                third = char3;
            } else {
                second = char3;
                third = char1;
            }
        } else {
            first = char3;
            if (char1 < char2) {
                second = char1;
                third = char2;
            } else {
                second = char2;
                third = char1;
            }
        }
        System.out.println("Characters in ascending order: " + first + ", " + second + ", " + third);

    }

}