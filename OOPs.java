/**
 * OOPs
 * 
**/

// Creating a class
class Student {
    // Declaring variables
    String name;
    int roll_no;

    // Creating a method
    void printDetails() {
        System.out.println("Name: " + name + " Roll No: " + roll_no);
    }

    // Creating a constructor
    Student() {
        name = "Unknown";
        roll_no = 0;
    }

    // Creating a parameterized constructor
    Student(String n, int r) {
        name = n;
        roll_no = r;
    }

    // Creating a method with return type
    int getRollNo() {
        return roll_no;
    }

    //polymorphism
    //complie time polymorphism
    //function overloading
    void print(int a){
        System.out.println(a);
    }

    void print(int a, int b){
        System.out.println(a + " " + b);
    }


}

//inheritance
class Shape{
    String color;
}

class Circle extends Shape{
    double radius;
}

//abstraction
abstract class Shape1{
    abstract void draw();
}

class Circle1 extends Shape1{
    void draw(){
        System.out.println("Drawing Circle");
    }
}

//interface
interface Shape2{
    void draw();
}

class Circle2 implements Shape2{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}



public class OOPs {
    
    public static void main(String[] args) {
        // Creating object of class
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.roll_no = 101;
        System.out.println("Name: " + s1.name + " Roll No: " + s1.roll_no);

        // Creating object of class using parameterized constructor
        Student s2 = new Student("Rohit", 102);
        s2.printDetails();

        // Accessing method with return type
        System.out.println("Roll No: " + s2.getRollNo());

        //copy constructor
        Student s3 = new Student(s2.name, s2.roll_no);
        s3.printDetails();

        //polymorphism
        //complie time polymorphism
        //function overloading
        s1.print(10);
        s1.print(10, 20);

        //inheritance
        Circle c = new Circle();
        c.color = "Red";
        c.radius = 10.5;
        System.out.println("Color: " + c.color + " Radius: " + c.radius);

        //abstraction
        Circle1 c1 = new Circle1();
        c1.draw();

        //interface
        Circle2 c2 = new Circle2();
        c2.draw();
        
    }
}