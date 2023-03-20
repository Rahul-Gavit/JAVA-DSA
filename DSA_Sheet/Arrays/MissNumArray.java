package DSA_Sheet.Arrays;

public class MissNumArray {

    //Find Missing Number in array
        public static int missingNumber(int[] nums) { //TC => O(n)
            
            int sum1 = 0;
            for(int i=0; i<nums.length; i++){
                sum1 += nums[i];
            }
            int sum2 = 0;
            for(int i=1; i<=nums.length; i++){
                sum2 += i;
            }
            int missNum = sum2-sum1;
    
            return missNum;
    
        }
        public static void main(String[] args) {
            int nums[] = {3, 0, 1};
            System.out.println(missingNumber(nums));
        }
}
