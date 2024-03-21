import java.util.Scanner;
public class SelectionSort {
    //finding min and max elements of the array
    static int getMin(int[] arr) {
        //finding min
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    static int getMax(int[] arr) {
        //finding max
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    static int[] sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            //min Index points to smallest element
            //swap i and minIndex elements
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.print("The array is ");
        System.out.println("Min element found at "+getMin(arr)+"th index");
        System.out.println("Max element found at "+getMax(arr)+"th index");
        sort(arr);
        System.out.println("The sorted array is ");
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}