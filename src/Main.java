import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        // Check if the user is 21 or older and display a message if true
        if (age >= 21) {
            System.out.println("You get a wristband!");
        }

        // Close the in
        in.close();
    }
}