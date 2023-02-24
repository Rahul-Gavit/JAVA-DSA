package Patterns.Code;

public class SolidRhombus {
    public static void solidRohmb(int n){

        for (int i=1; i<=n; i++){

            for (int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        solidRohmb(n);
    }
}
