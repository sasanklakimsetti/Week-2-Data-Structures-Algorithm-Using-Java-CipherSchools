public class Arrays {
    static void print(int arr[]){
        int size=arr.length;
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        //1.Array creation expression
        int size=5;
        int[] arr=new int[size];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        print(arr);
        System.out.println();
        for(int i=0;i<size;i++)
            arr[i]=i+1;
        print(arr);
        System.out.println();
        //2.Array initializers list
        int[] arr2={1,2,3};
        print(arr2);
        //if we want to increase size of array
        int[] copyArray=new int[2*size];
        //copy all the elements from old to new array
        for(int i=0;i<size;i++){
            copyArray[i]=arr[i];
        }
        copyArray[5]=6;
        copyArray[6]=7;
        print(copyArray);
    }
}