package DP.Code;

import java.util.Arrays;

public class Mcm {

    public static int mcm(int arr[], int i, int j){
        if(i == j){
            return 0; //single matrix case
        }

        int minCost = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++){
            int cost1 = mcm(arr, i, k); //Ai...Ak => arr[i-1] X arr[k]
            int cost2 = mcm(arr, k+1, j); //Ai+1...Aj => arr[k] X arr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            minCost = Math.min(minCost, finalCost);
        }
        return minCost;

    }

    //Memoization Approach
    public static int mcmM(int arr[], int i, int j, int dp[][]){ //O(n square)
        if(i == j){
            return 0; //single matrix case
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int minCost = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++){
            int cost1 = mcmM(arr, i, k, dp); 
            int cost2 = mcmM(arr, k+1, j, dp); 
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            minCost = Math.min(minCost, finalCost);
        }
        return dp[i][j] = minCost;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        int n = arr.length;
        int dp[][] = new int[n][n];
        System.out.println(mcm(arr, 1, n-1));
        for(int i=0; i<arr.length; i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(mcmM(arr, 1, n-1, dp));
    }
}
