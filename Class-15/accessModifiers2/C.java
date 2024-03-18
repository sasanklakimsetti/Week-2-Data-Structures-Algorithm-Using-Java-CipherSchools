package accessModifiers2;
import accessModifiers1.A;
public class C extends A {
    public static void main(String[] args){
        A obj=new A();
        C obj2=new C();
        //System.out.println(obj.x);   //default is not accesible outside the package also for the subclass object
        //System.out.println(obj.y);  //private is not accessible outside the class and package
        System.out.println(obj.w); //public is able to access everywhere
        System.out.println(obj2.z);  //can't access the value of obj of A but can access the value of z in C
    }
}