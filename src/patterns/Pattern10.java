package patterns;

//0-1 Triangle
public class Pattern10 {
    public static void printPattern(){
        System.out.println("\n0-1 Triangle");
        int n=5;
        //outer loop
        for (int i=1; i<=n; i++){
            //inner loop
            for (int j =1 ; j<=i; j++){
               if (( i+j ) % 2== 0){
                   System.out.print(1 + " ");
               }else {
                   System.out.print(0 + " ");
               }
            }
            System.out.println();
        }
    }
}
