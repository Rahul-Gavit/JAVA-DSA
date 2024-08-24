public class BitMan {

    public static void oddEven(int n) {
        int bitMask = 1;

        if((n & bitMask) == 0) {
            System.out.println("Odd Number");
        }else {
            System.out.println("Even Number");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;

        if((n & bitMask) == 0) {
            return 0;
        }else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;

        return n | bitMask;
    }
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);

        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearLastIthBit(int n, int i) {
        int bitMask = ~(0) << i;
        return n & bitMask;
    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n-1) )== 0;
    }

    public static int countBit(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) != 0) {
                count++;
            }
                n = n>>1;
            
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;

        while(n > 0 ) {
            if((n & 1) != 0) {
                ans *= a;
            } 
            a *= a;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        oddEven(3);
        oddEven(8);
        
        System.out.println(getIthBit(4, 2));
        System.out.println(setIthBit(4, 1));
        System.out.println(clearIthBit(4, 2));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearLastIthBit(15, 2));
        System.out.println(clearBitsInRange(10, 2, 4));
        System.out.println(isPowerOfTwo(4));
        System.out.println(countBit(15));
        System.out.println(fastExpo(5, 2));
    }
}