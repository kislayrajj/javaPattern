package patterns;

// half pyramid upside down
//*
//**
//***
//****
public class Pattern5 {
    public static void printPattern(){
        System.out.println("\nHalf pyramid upside down");
        for (int i = 5; i >= 1; i--) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
