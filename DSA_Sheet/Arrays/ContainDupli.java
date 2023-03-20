package DSA_Sheet.Arrays;

import java.util.Arrays;

public class ContainDupli {

        public static boolean containsDuplicate(int[] nums) { //TC => O(n)
    
            Arrays.sort(nums);
            for(int i=0; i<nums.length-1; i++){
                if(nums[i] == nums[i+1]){
                    return true;
                }
            }
            return false;
        }

        public static int findDuplicate(int[] nums) {
                
            Arrays.sort(nums);
            for(int i=0; i<nums.length-1; i++){
                if(nums[i] == nums[i+1]){
                    return nums[i];
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int nums[] = {1, 2, 3, 1};
            System.out.println(containsDuplicate(nums));
            System.out.println(findDuplicate(nums));
        }
}
