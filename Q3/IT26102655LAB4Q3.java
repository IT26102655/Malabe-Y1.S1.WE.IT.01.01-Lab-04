import java.util.Scanner;

public class IT26102655LAB4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int Number = scanner.nextInt();

        // Nested ternary operator to check Positive, Negative, or Zero
        String result = (Number > 0) ? "The Number is: Positive" : 
                        (Number < 0) ? "The Number is: Negative" : 
                        "The Number is: Zero";

        System.out.println(result);

        scanner.close();
    }
}