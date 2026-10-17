import java.util.Scanner;

public class IT26102655LAB4Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int Number = scanner.nextInt();

        if (Number > 0) {
            System.out.println("The Number is: Positive");
        } else if (Number < 0) {
            System.out.println("The Number is: Negative");
        } else {
            System.out.println("The Number is Zero");
        }

        scanner.close();
    }
}