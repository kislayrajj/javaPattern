package patterns;


//patter - solid rectangle
//*****
//*****
//*****
//*****
public class Pattern2 {
    public static void printPattern() {
        System.out.println("\nSolid Rectangle Pattern");
        //outer loop
        for (int i = 1; i <= 4; i++) {
            //inner loop
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println(); // break the line (row) after printing 5 stars
        }
    }
}
