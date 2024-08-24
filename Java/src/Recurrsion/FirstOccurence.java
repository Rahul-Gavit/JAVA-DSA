public class FirstOccurence {

    public static void firstOccurence(int arr[], int key, int i) {
        if(arr.length == i) {
            System.out.println("Key not exist");
            return;
        }

        if(key == arr[i]) {
            System.out.println("First key index "+ i);
            return;
        }

        firstOccurence(arr, key, i+1);

    }
    static int count = 0;

    public static void lastOccurence(int arr[], int key, int i) {

        if(arr.length == i) {
            if(count > 0) {
                System.out.println("last key index " + count);
                return;
            }
            if(count == 0) {
                System.out.println("Key not exist");
                return;
            }
        }

        if(key == arr[i]) {
            if(count < i) {
                count = i;
            }
        }

        lastOccurence(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 7, 5, 6, 5, 2};
        int key = 5;
        firstOccurence(arr, key, 0);
        lastOccurence(arr, key, 0);
    }
}