/*
   Write a method named isEven that accepts an int argument.
   The method should return true if the argument iseven, or false otherwise.
   Also write a program to test your method.
 */

package Functions_Methods.Code;
import java.util.Scanner;
public class IsEvenOdd {

    public static boolean isEvenOdd(int num){

        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int Num = sc.nextInt();
        System.out.println(isEvenOdd(Num));
    }
}
