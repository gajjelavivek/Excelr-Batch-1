import java.util.Scanner;

public class Demo034 {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
