/*
     Question:
            -> Count Ways to reach the nth stair. The Person Can Climbe either 1 stair or 2
               stairs at a time.
 */

package DP.Code;
import java.util.*;
public class ClimbingStairs {

    //Recursive Approach -> O(2 res to n)
    public static int countWays(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        return countWays(n-1) + countWays(n-2);
    }

    // Memoization Approach -> O(n)
    public static int countWaysM(int n, int ways[]){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        if(ways[n] != -1){ // alerdy calculated
            return ways[n];
        }

        return countWaysM(n-1, ways) + countWaysM(n-2, ways);


    }

    //Tabulation Approach -> O(n)
    public static int countWaysT(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;

        for(int i=1; i<=n; i++){
            if(i == 1){
                dp[i] = dp[i-1];
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println(countWays(n));
        System.out.println(countWaysM(n, ways));
        System.out.println(countWaysT(n));
    }
}
