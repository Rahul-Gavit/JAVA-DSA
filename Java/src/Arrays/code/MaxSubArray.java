package Arrays.code;

public class MaxSubArray {
    
    // BruteForce Approach
    public static int maxSubArray(int nums[]){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){

            for(int j=i; j<nums.length; j++){
                currSum = 0;

                for(int k=i; k<=j; k++){
                    currSum += nums[k];
                }
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    // Prefix Approach
    public static int prefixSubArray(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];

        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i=0; i<nums.length; i++){
            int start = i;
            for(int j=i; j<nums.length; j++){
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

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
        System.out.println(maxSubArray(nums));
        System.out.println(prefixSubArray(nums));
        System.out.println(kadans(nums2));
    }
}
