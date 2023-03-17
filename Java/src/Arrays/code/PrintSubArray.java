package Arrays.code;

public class PrintSubArray {
    public static void printArray(int nums[]){
        
        int ts = 0;

        for(int i=0; i<nums.length; i++){
            int start = i;

            for(int j=i; j<nums.length; j++){
                int end = j;

                for(int k=start; k<=end; k++){

                    System.out.print(nums[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: "+ts);
    }
    public static void main(String[] args) {
        int nums[] = {1, -2, 6, -1, 3};
        printArray(nums);
    }
}
