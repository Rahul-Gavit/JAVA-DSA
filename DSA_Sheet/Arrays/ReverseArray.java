package DSA_Sheet.Arrays;

public class ReverseArray {

    //approach 1
    public static void reverseArray(int arr[]){ //TC => O(n)

        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reverseArray2(int arr[], int start, int end){ //TC => O(n)

        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int arr[]){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        // reverseArray(arr);
        printArray(arr);
        System.out.println();
        reverseArray2(arr, 0, 5);
        printArray(arr);
    }
}
