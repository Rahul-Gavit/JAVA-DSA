package DSA_Sheet.Arrays;

public class MaxSubArray {
    
    //Kadans Approach (work on negative numbers also)
    public static int kadans(int[] nums) { //TC => O(n)
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            currSum = currSum + nums[i];
            if( maxSum < currSum){
                maxSum = currSum;
            }
            currSum = Math.max(currSum, 0);
        }
        return maxSum;
    } 
    public static void main(String[] args) {
        int nums[] = {1, -2, 6, -1, 3};
        int nums2[] = {-1, -2, -3};

        System.out.println(kadans(nums));
        System.out.println(kadans(nums2));
    }
}
