package patterns;

// Inverted Half Pyramid
public class Pattern6 {
    public static void printPattern(){

        System.out.println("\nInverted Half Pyramid");
//outermost loop
        int n=4;

        for(int i=1; i<=n; i++){
            //inner loop 1 to print spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            // inner loop to print stars
            for (int k =1 ;k<=i;k++){
                System.out.print("*");
            }
            // break the line
            System.out.println();
        }
    }
}
