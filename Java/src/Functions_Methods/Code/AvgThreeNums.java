//Write a Java method to compute the averageof three numbers

package Functions_Methods.Code;
import java.util.Scanner;
public class AvgThreeNums {

    public static void avgThreeNums(int num1, int num2, int num3){

        int sum = (num1+num2+num3)/3;
        System.out.println("Average of Three numbers is "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter Num3 : ");
        int num3 = sc.nextInt();
        avgThreeNums(num1, num2, num3);

    }
}
