package Patterns.Code;

public class FlyodsTraingle {

    public static void floydsTrain(int n){
        int idx =1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" "+idx);
                idx++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        floydsTrain(n);
    }
}
