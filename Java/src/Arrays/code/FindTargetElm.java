package Arrays.code;

public class FindTargetElm {

    // Approach 1 -> O(n)
    public static void findTargetElm(int arr[], int key){

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == key){
                System.out.print(i);
            }
        }
    }

    //Approach 2 -> O(log n)

    public static int search(int[] nums, int target) {
    //min will have index of minimum element of nums 
    int min = minSearch(nums); 
    //find in sorted left 
    if(nums[min] <= target && target <= nums[nums.length-1]){
         return search(nums,min,nums.length-1,target); 
        } 
        //find in sorted right 
        else{ 
            return search(nums,0,min,target); 
        } 
    }
    //binary search to find target in left to right boundary 
    public static int search(int[] nums,int left,int right,int target){ 
        int l = left; int r  = right;
        // System.out.println(left+" "+right); 
        while(l <= r){ 
            int mid = l + (r - l)/2; 
            if(nums[mid] ==   target){ 
                return mid; 
            } else if(nums[mid] > target){
                 r = mid-1; 
                } else{ 
                    l = mid+1; 
                } 
            } 
            return -1; 
        }
    
    public static int minSearch(int []arr){
        int left = 0;
        int right = arr.length-1;
        
        while(left < right){
            int mid = left + (right - left)/2;
            if(mid > 0 && arr[mid -1] > arr[mid]){
                return mid;
            }else if(arr[left] <= arr[mid] && arr[mid] > arr[right]){
                left = mid +1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        findTargetElm(arr, target);
        System.out.println();
        System.out.println(search(arr, target));
    }
}
