package SegmentTrees.Code;

public class MinMaxST {

    static int tree[];

    public static void init(int n){
        tree = new int[4*n];
    }

    public static void buildST(int i, int si, int sj, int arr[]){
        if(si == sj){
            tree[i] = arr[si];
            return;
        }

        int mid = (si+sj)/2;
        buildST(2*i+1, si, mid, arr); //left subtree
        buildST(2*i+2, mid+1, sj, arr); //right subtree

        tree[i] = Math.max(tree[2*i+1], tree[2*i+2]);
    }

    public static int getMax(int arr[], int qi, int qj){
        int n = arr.length;
        return getMaxUtil(0, 0, n-1, qi, qj);
    }

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj){
        if(qj <= si || qi >= sj){ //Non overlaping
            return Integer.MIN_VALUE;
        }else if(si >= qi &&  sj <= qj){ //Complete overlaping
            return tree[i];
        }else{  //Partial Overlaping
            int mid = (si + sj)/2;
            int left = getMaxUtil(2*i+1, si, mid, qi, qj);
            int right = getMaxUtil(2*i+2, mid+1, sj, qi, qj);
            return Math.max(left, right);
        }
    }

    public static void updateUtil(int i, int si, int sj, int idx, int newVal){
        if(idx > sj || idx < si){
            return;
        }

        if(si == sj){
            tree[i] = newVal;
        }

        if(si != sj){//non-leaf
            tree[i] = Math.max(tree[i], newVal);
            int mid = (si+sj)/2;
            updateUtil(2*i+1, si, mid, idx, newVal);
            updateUtil(2*i+2, mid+1, sj, idx, newVal);
        }
    }

    public static void update(int arr[], int idx, int newVal){
        arr[idx] = newVal;
        int n = arr.length;
        updateUtil(0, 0, n-1, idx, newVal); //Segment tree updation
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;
        init(n);
        buildST(0, 0, n-1, arr);

        for(int i=0; i<tree.length; i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();

        System.out.println(getMax(arr, 2, 5));
        update(arr, 2, 29);
        System.out.println(getMax(arr, 1, 5));
    }
}
