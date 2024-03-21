import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  //in represents to read input
        //in is part of inputStream of System class
        System.out.print("Enter name: ");String str=sc.nextLine(); //this encourages spaces as well
        System.out.println(str);
        System.out.print("Enter name again: ");String str2=sc.next(); //this won't encourage spaces i.e. it will take input upto space only after the space it won't consider as input and stop taking
        System.out.println(str2);
        System.out.print("Enter first name: ");String fName=sc.next();
        System.out.print("Enter last name: ");String lName=sc.next();  //it will keep the cursor at the same line
        //if we give input of first name with space then the input after space will be considered as input of lName
        System.out.println("First name: "+fName);
        System.out.println("Last name: "+lName);
        sc.nextLine();  //makes the cursor go to next line so that we can enter the next input
        //since we have used next() to get the output of lName, the cursor will be in the same line of the input after taking the input of lname, it won't shift to next Line
        //when we nextLine() normally, the cursor will get shifted to nextLine() and we will be able to enter the next input
        System.out.print("Enter address: ");String address=sc.nextLine();
        String hello=sc.nextLine();
        System.out.println("Address: "+address);
        System.out.println(hello);
        int n=sc.nextInt();
        float f=sc.nextFloat();
        double d=sc.nextDouble();
        long l=sc.nextLong();
        System.out.println("Integer: "+n);
        System.out.println("Float: "+f);
        System.out.println("Double: "+d);
        System.out.println("Long: "+l);
        sc.close(); //closing the scanner class
    }
}