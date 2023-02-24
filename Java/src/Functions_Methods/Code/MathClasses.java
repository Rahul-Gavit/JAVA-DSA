package Functions_Methods.Code;

import java.util.Scanner;

public class MathClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter Num3 : ");
        int num3 = sc.nextInt();

        int min = Math.min(num1, Math.min(num2, num3));
        int max = Math.max(num1, Math.max(num2, num3));
        double squre = Math.sqrt(num1);
        double power = Math.pow(num1, 2);
        int absolute = Math.abs(num1);
        System.out.println("Min number is: "+min);
        System.out.println("Max number is: "+max);
        System.out.println("Square root is: "+squre);
        System.out.println("Power is: "+power);
        System.out.println("Absolute is: "+absolute);

    }
}
