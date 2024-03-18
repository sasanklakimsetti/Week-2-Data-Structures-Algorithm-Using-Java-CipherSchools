class Demo{
    private int a=5;
    private int b=10;
    private int c=15;
    private int d=20;
    //getter methods
    public int getA(){
        System.out.println("Value of A read");
        return this.a;
    }
    public int getB(){
        System.out.println("Value of B read");
        return this.b;
    }
    //setter methods
    public void setA(int a){
        if(a>100){
            this.a=a;
            System.out.println("Value of A changed to "+a);
            //if value is greater than 100 then it will be changed other it will take the value of previously declared
            //this is the benefit of encapsulation
        }
        else System.out.println("Value of A can't set outside limits");
    }
    public void setB(int b){
        this.b=b;
    }
    //we can generate setters and getters without coding
    //right click -> Generate -> select getter/ setter -> select the value
    //constructors can also be generated automatically

    //read-only
    //no setter
    //can only read, can't write
    public int getC() {
        return c;
    }
    //write-only
    //no getter
    //can only write. can't read
    public void setD(int d) {
        this.d = d;
    }
}
public class EncapsulationStudy {
    public static void main(String[] args) {
        Demo d = new Demo();
        //System.out.println(d.a);//not visible because private
        d.setA(101);
        System.out.println(d.getA());
        d.setA(12);
        System.out.println(d.getA());
    }
}