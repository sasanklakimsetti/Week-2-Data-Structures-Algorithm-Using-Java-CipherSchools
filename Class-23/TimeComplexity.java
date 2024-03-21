public class TimeComplexity {
    static boolean isPrimeRam(long n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static boolean isPrimeSham(long n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    //both the approaches give the same output but the time taken/ compares taken to solve the problem will be different.
    public static void main(String[] args){
        long n=1000000000;
        long start=System.currentTimeMillis(); //return time before start of the function
        System.out.println(isPrimeRam(n));
        long end=System.currentTimeMillis(); //returns time after completion of function
        System.out.println("Total time taken for Ram's approach: "+(end-start));
        long start1=System.currentTimeMillis();
        System.out.println(isPrimeSham(n));
        long end1=System.currentTimeMillis();
        System.out.println("Total time taken for Sham's approach: "+(end1-start1));
        //time taken will be dependent on the input size
        //if the input size is small then the execution will be faster
        //if large then the execution time will be more
    }
}