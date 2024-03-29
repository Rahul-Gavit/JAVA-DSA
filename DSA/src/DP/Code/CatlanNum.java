package DP.Code;

import java.util.Arrays;

public class CatlanNum {

    //Recursive Approach
    
    public static int catlanNum(int n){
        if(n == 0 || n ==1){
            return 1;
        }

        int ans = 0; 
        for(int i=0; i<=n-1; i++){
            ans += catlanNum(i) * catlanNum(n-i-1);
        }
        return ans;
    }

    // Memoization Approach

    public static int catlanMemo(int n, int dp[]){
        if( n==0 || n==1 ){
            return 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int ans=0;
        for(int i=0; i<n; i++){
            ans += catlanMemo(i, dp) * catlanMemo(n-i-1, dp);
        }

        return dp[n] = ans;
    }

    // Tabulation Approach 

    public static int catlanTab(int n){  //O(n square)
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            for(int j=0; j<i; j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(catlanNum(n));

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(catlanMemo(n, dp));
        System.out.println(catlanTab(n));
    }
}
