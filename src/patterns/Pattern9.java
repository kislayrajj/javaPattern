package patterns;

//Floyd's Triangle
public class Pattern9 {
    public static void printPattern() {
        System.out.println("\nFloyd's Triangle");
        int n = 5;
        int num = 0;
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                num ++;
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
