package patterns;


//Inverted Half Pyramid with numbers
public class Pattern8 {
    public static void printPattern() {
        System.out.println("\nInverted Half Pyramid with numbers");
        int n = 5;
        //outer loop
        for (int i = n; i >= 1; i--) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
