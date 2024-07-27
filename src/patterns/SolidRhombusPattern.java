package patterns;

public class SolidRhombusPattern {
    public static void printSolidRhombus() {
        System.out.println("\nSolid Rhombus Pattern");
        int n = 5;

        //outer loop
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
