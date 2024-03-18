package accessModifiers2;

import accessModifiers1.A;
public class D {
    public static void main(String[] args){
        A obj=new A();
        D obj2=new D();
        //System.out.println(obj.x); //default is not accesible outside the package
        //System.out.println(obj.y);  //private is not accessible outside the class and package
        System.out.println(obj.w); //public is able to access everywhere
        //System.out.println(obj2.z);  //can't access the protected variables outside the package in non-subclass
    }
}