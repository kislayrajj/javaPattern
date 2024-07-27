package patterns;


import java.util.Scanner;

//Half Pyramid with numbers taken from user
public class DynamicPattern {
    public static void printPattern() {
        System.out.print("\nEnter the number of rows for your half pyramid : ");

        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt(); // take input from the user
        System.out.println("Your Half Pyramid of num : " + n);
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
