abstract class Base{
    public Base(){
        System.out.println("constructor of base class");
    }
    public String sayHello(){
        String a="method of base class";
        System.out.println(a);
        return a;
    }
    abstract void database();
}

class Data extends Base{

    @Override
    void database() {
        String name="Soumyadeep";
        System.out.println("name of employee" + " " +name);
    }   
}

public class Abstract1 {
    public static void main(String[] args){
       //Base b=new Base(); not possible since it is an abstract class
       Data d=new Data(); 
       d.database();
       d.sayHello();//method doesn't get printed automatically
    } 
}
