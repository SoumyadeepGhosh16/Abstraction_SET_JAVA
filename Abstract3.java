abstract class Data{
    abstract void PrintInfo();
}

class student1 extends Data{
    public void PrintInfo(){
        String name="Soumyadeep";
        String dept="AEIE";
        int id=1090;

        System.out.println("name of the student" +name);
        System.out.println("department of student" +dept);
        System.out.println("id of the student" +id);
    }
}

public class Abstract3 {
    public static void main(String[] args) {
        
        student1 b1=new student1();
        b1.PrintInfo();

         // Data d1=new base();
          //d1.PrintInfo();
    }
}
