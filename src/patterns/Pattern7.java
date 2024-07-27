package patterns;


//Half Pyramid with numbers
public class Pattern7 {
    public static void printPattern() {
        System.out.println("\nHalf Pyramid with numbers");
        int n = 5;
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
