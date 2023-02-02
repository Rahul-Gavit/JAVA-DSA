/*
    Question: 
            -> Find Longest Common Substring from the string.
               S1 = "ABCDE" S2 = "ABGCE" =>  ans = "AB"
        Note: 
            -> a substring is a contiguous sequence of characters within a string
 */

package DP.Code;

public class LcSubstring {

    public static int lcsubstringT(String str1, String str2){  //O(n*m)
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        int ans = 0;

        for(int i=0; i<n+1; i++){   //It's not compulsury in java.
            for(int j=0; j<m+1; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }

        //Bottom Up
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                }else{
                    dp[i][j] = 0;   //Reset the Counter
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str1 = "ABCDE";
        String str2 = "ABGCE"; // 2"AB"

        System.out.println(lcsubstringT(str1, str2));
    }
}
