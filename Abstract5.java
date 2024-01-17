import java.io.*;

abstract class B{
     abstract class C{
        abstract void MyMethod();
     }
}

class D extends B{
    class E extends C{
        void MyMethod(){
            System.out.println("method of extended abstract class");
        }
    }
}
public class Abstract5 {
    public static void main(String[] args) {
        D outer=new D();
        D.E inner=(outer).new E();

        inner.MyMethod();
    }
}
