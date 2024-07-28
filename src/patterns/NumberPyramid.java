package patterns;

public class NumberPyramid {
    public static void printNumberPyramid(){
        System.out.println("\nNumber Pyramid");
int n =5;
        //outer loop

        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
