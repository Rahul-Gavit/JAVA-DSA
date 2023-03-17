package Functions_Methods.Code;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int digits = sc.nextInt();
        System.out.println("The sum is "+sumDigits(digits));
    }
    public static int sumDigits(int n) {
        int sumOfDigits=0;
        while(n>0) {
            int lastDigit = n%10;
            sumOfDigits += lastDigit;
            n = n/10;
        }return sumOfDigits;
    }
    }