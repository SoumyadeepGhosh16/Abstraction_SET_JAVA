import java.util.*;

abstract class pen{
      abstract void write();

      abstract void refill();
}

class FountainPen extends pen{
     void write(){
        System.out.println("writing something");
     }
     void refill(){
        System.out.println("refill the pen");
     }
     void changeNib(){
        System.out.println("changing the nib");
     }
}

class Monkey{
     public void jump(){
        System.out.println("jumping");
     }
     public void bite(){
        System.out.println("biting");
     } 
}

interface BasicAnimals{
      void eat();
      void sleep();

}

class Human extends Monkey implements BasicAnimals{
     public void eat(){
        System.out.println("animal is eating");
     }
     public void sleep(){
        System.out.println("animal is sleeping");
     }
}

public class Abstract2 {
    public static void main(String[] args) {
        Human h=new Human();
        h.jump();
        h.bite();
    }
}
