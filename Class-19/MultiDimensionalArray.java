public class MultiDimensionalArray {
    public static void main(String[] args){
        int rows=5;
        int cols=3;
        int[][] arr=new int[rows][cols];
        for(int i=0;i<arr.length;i++){   //for rows
            for(int j=0;j<arr[0].length;j++){ //for columns
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //Array initializer lists
        //We want to create the following array:
//        1 2 3
//        4 5 6
//        7 8 9
        int[][] arr1={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println();
        for(int i=0;i<arr1.length;i++){   //for rows
            for(int j=0;j<arr1[0].length;j++){ //for columns
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}