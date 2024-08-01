package patterns;

// same as diamond but tweaked spaces
public class BirdHordePattern {
    public static void printBirdHordePattern(){
        System.out.println("\nBirdHordePattern");
        int n=4;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++ ){
                System.out.print(" "); // 3 white spaces for better looking diamond
            }
            for (int j = i; j>=1; j--){
                System.out.print(" * ");
            }
            for(int j=2; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1; j<=n-i; j++ ){
                System.out.print(" ");  // 3 white space
            }
            for (int j = i; j>=1; j--){
                System.out.print(" * ");
            }
            for(int j=2; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
