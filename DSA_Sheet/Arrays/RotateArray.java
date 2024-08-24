package DSA_Sheet.Arrays;

import java.util.Scanner;

public class RotateArray {
    
    public static void rotateArray(int arr[], int k, int n){

		int temp[] = new int[n];

		//keep track on the current index
		int t = 0;

		for(int i=k; i<n; i++){
			temp[t] = arr[i];
			t++;
		}

		for(int i=0; i<k; i++){
			temp[t] = arr[i];
			t++;
		}

		for(int i=0; i<n; i++){
			arr[i] = temp[i];
		}

	}

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		rotateArray(arr, k, n);

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		
	}
}

