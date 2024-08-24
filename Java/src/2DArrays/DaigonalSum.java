
class DaigonalSum {

    public static void digonalMatrix(int matrix[][]) {
        // int startRow = 0;
        // int startCol = 0;
        // int endRow = matrix.length-1;
        // int endCol = matrix[0].length - 1;
        // int sum = 0;

        // for(int i=startRow; i<=endRow; i++){
        //     for(int j=startCol; j<=endCol; j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }else if(i+j == endCol){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // System.out.println(sum);

        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            sum += matrix[i][i];

            if(i != matrix.length-i-1){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        digonalMatrix(matrix);

    }
}
