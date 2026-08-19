/*Problem 3: Shape Calculator using Abstract Class
Problem Statement
Create an abstract class Shape containing:
abstract void calculateArea();
abstract void calculatePerimeter();
Create the following subclasses:
         Circle
 Rectangle
 Triangle
Each subclass should implement the abstract methods according to its shape.
For example:
Circle
 Area = π × r × r
 Perimeter = 2 × π × r
        Rectangle
 Area = length × breadth
 Perimeter = 2 × (length + breadth)
Triangle
 Area = 1⁄2 × base × height
 Perimeter = side1 + side2 + side3
Create objects of each subclass and display their area and perimeter.
        Concepts Practiced
 Abstract class
 Abstract methods

 Method overriding
 Inheritance
 Objects
 Runtime polymorphism
Challenge
Create an array of Shape references and store different shape objects in it.
        Shape s[] = new Shape[3];
s[0] = new Circle(...);
s[1] = new Rectangle(...);
s[2] = new Triangle(...);
Call the methods using the array.*/

abstract class Shape{
    abstract void calculateArea();

    abstract void calculatePerimeter();
}



class Circle extends Shape{

    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    void calculateArea() {
        System.out.println("Area of Circle = "+3.14f*radius*radius);
    }

    void calculatePerimeter() {
        System.out.println("Perimeter of Circle = "+2*3.14f*radius);
    }
}



class Rectangle extends Shape{
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        System.out.println("Area of Rectangle = "+length*breadth);
    }
    void calculatePerimeter() {
        System.out.println("Perimeter of Rectangle = "+2*(length+breadth));
    }
}



class Triangle extends Shape{
    int base;
    int height;
    int side1;
    int side2;
    int side3;

    Triangle(int base, int height, int side1, int side2, int side3){
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    void calculateArea() {
        System.out.println("Area of Triangle = "+0.5*base*height);
    }

    void calculatePerimeter() {
        System.out.println("Perimeter of Triangle = "+(side1+side2+side3));
    }
}
public class A2Ques3 {
    public static void main(String[] args) {
        /*Circle c1 = new Circle(10);
        Triangle t1 = new Triangle(10, 10,2,5,6);
        Rectangle r1 = new Rectangle(10, 10);

        c1.calculateArea();
        c1.calculatePerimeter();

        t1.calculateArea();
        t1.calculatePerimeter();

        r1.calculateArea();
        r1.calculatePerimeter();*/

        // Challenge --->

        Shape [] s = new Shape[3];

        s[0] = new Circle(7);
        s[1] = new Rectangle(10,20);
        s[2] = new Triangle(5,10,2,5,6);

        for(int i = 0 ; i < 3 ; i++){
            s[i].calculateArea();
            s[i].calculatePerimeter();
        }
    }
}
