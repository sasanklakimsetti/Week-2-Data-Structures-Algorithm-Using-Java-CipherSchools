//example:
//0 1 2 3
//4 5 6
//7 8 9 10 11
//in Jagged Array, no.of rows is fixed and columns are different
public class JaggedArray {
    public static void main(String[] args){
        int[][] arr=new int[3][];  //specifying no.od rows in the array

        //specifying no.of columns in each row
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[5];
        for (int i=0;i<arr.length;i++){ //for rows
            for(int j=0;j<arr[i].length;j++){  //for columns
                //since no.of columns in each row is different, we need to use arr[i].length so that it will retrieve no.of columns in each
                //but in multidimensional array, no.of columns is same in every row, so we can use arr[0].length
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //using array initializer lists
//        int[][] arr1=new int[3][];
//        arr1[0]={1,2,3};
//        arr1[1]={4,5};
//        arr1[2]={6,7,8,9};
        //we can't use initializer lists here because it doesn't create an  object
        System.out.println();
        System.out.println();
        int[][] arr2={
                {1,2,3},
                {4,5},
                {6,7,8,9,10}
        };
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++)
                System.out.print(arr2[i][j]+" ");
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //using anonymous arrays : just for creating and using instantly, can be called as nameless array
        int[][] arr3=new int[3][];
        arr3[0]=new int[] {1,2,3};
        arr3[1]=new int[] {4,5};
        arr3[2]=new int[] {6,7,8,9};
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[i].length;j++)
                System.out.print(arr3[i][j]+" ");
            System.out.println();
        }
    }
}