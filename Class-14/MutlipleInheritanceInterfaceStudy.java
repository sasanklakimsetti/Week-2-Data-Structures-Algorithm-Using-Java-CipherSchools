interface A{
    int x=10;
    void fun();
}
interface B{
    int x=20;
    void fun();
}
class C implements A,B{
    public void fun(){
        System.out.println("I'm function in C");
        System.out.println(A.x);
        System.out.println(B.x);
    }
}
//multiple inheritance through interfaces
interface D extends A,B{
    void fun();
}
class E implements D{
    public void fun(){
        System.out.println("I'm function in D");
    }
}
public class MutlipleInheritanceInterfaceStudy {
    public static void main(String[] args){
        C c=new C();
        c.fun();
        E d=new E();
        d.fun();
    }
}