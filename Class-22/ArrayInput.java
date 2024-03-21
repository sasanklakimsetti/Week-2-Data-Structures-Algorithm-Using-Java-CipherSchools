//taking array inputs in java
import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements: ");
        //array input using for loop
        for(int i=0;i<n;i++) {
            System.out.print("Enter "+(i+1)+"th element: ");
            arr[i] = sc.nextInt();
        }
        //array traversal using for loop
        System.out.print("The array is ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        sc.close();
    }
}