abstract class Shape{
    abstract double getArea();
}

class Circle extends Shape{
    public double radius;

     Circle(double radius){
         this.radius=radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    public double height,width;

     Rectangle(double height,double width){
         this.height=height;
         this.width=width;
    }

    public double getArea(){
        return height*width;
    }
}

public class Abstract4 {
    public static void main(String[] args) {
        Circle c1=new Circle(5);
        Rectangle r1=new Rectangle(10,20);

        System.out.println("area of the circle is" +c1.getArea());

        System.out.println("area of the rectangle is" +r1.getArea());
    }
}
