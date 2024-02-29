public class Power {
    public static int pow (int x, int n)
    {
        if (n == 0)
        {
            return 1;
        }
        int halfPow = pow (x, n / 2);
        int halfPower = halfPow * halfPow;

        if (n % 2 != 0)
        {
            halfPower = x * halfPower;
        }
        return halfPower;
    }
    public static void main (String[]args)
    {
        int x = 2;
        int n = 5;
        System.out.println (pow (x, n));
    }
}