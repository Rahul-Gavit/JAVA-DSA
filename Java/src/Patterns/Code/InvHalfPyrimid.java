package Patterns.Code;

public class InvHalfPyrimid {

    public static void invHalfPyrimid(int n){

        for (int i=1; i<=n; i++){
            int num = 1;
            for (int j=i; j<=n; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n= 5;
        invHalfPyrimid(n);
    }
}
