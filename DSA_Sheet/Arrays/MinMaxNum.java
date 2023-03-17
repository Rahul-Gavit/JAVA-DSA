package DSA_Sheet.Arrays;

public class MinMaxNum {

    static class Pairs{
        int min;
        int max;
    }
     static Pairs minMaxNum(int arr[], int n){

        Pairs minmax = new Pairs();

        // single element in array
        if(n == 1){
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }

        //more than one element in array
        for(int i=1; i<n; i++){
            if(arr[i] > minmax.max){
                minmax.max = arr[i];
            }else if(arr[i] < minmax.max){
                minmax.min = arr[i];
            }
        }
        return minmax;
     }

    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 1, 9, 34, 76};
        int n = arr.length;

        Pairs minmax = minMaxNum(arr, n);
        System.out.println("Min number: "+minmax.min);
        System.out.println("Max number: "+minmax.max);
    }
    
}
