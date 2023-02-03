package DP.Code;

public class MountainRange {

    public static int mountainRange(int n){ //O(n square)
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            // i pairs -> mountain ranges => Ci
            for(int j=0; j<i; j++){
                int inside = dp[j];
                int outside = dp[i-j-1];
                dp[i] += inside * outside; // ci = cj*ci-j-1
            }
        }
        //n pairs
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(mountainRange(n));
    }
}
