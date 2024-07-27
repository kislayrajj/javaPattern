package patterns;

// half pyramid
//*
//**
//***
//****
public class Pattern4 {
    public static void printPattern() {
        System.out.println("\nHalf Pyramid");
        //outer loop
        for (int i = 1; i <= 5; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
