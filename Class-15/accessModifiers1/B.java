package accessModifiers1;
public class B {
    public static void main(String[] args){
        A obj=new A();
        System.out.println(obj.x);
        //System.out.println(obj.y);  //private is not accessible outside the class and package
        System.out.println(obj.w); //able to access outside the class
        System.out.println(obj.z);  //able to access outside the class in the same package
    }
}