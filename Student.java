class Students {

    String name;
 
    int age;
 
  
 
    public void getInfo() {
 
        System.out.println("The name of this Student is " + this.name);
 
        System.out.println("The age of this Student is " + this.age);
 
    }
 
 }
 
 
 public class Student {
 
    public static void main(String args[]) {
 
        Student s1 = new Student();
 
        s1.name = "Aman";
 
        s1.age = 24;
 
        s1.getInfo();
 
 
        Student s2 = new Student();
 
        s2.name = "Shradha";
 
        s2.age = 22;
 
        s2.getInfo();
 
    }
 
 }
 
 Example 2:
 
 class Pen {
 
    String color;
 
  
 
    public void printColor() {
 
        System.out.println("The color of this Pen is " + this.color);
 
    }
 
 }
 
 
 public class OOPS {
 
    public static void main(String args[]) {
 
        Pen p1 = new Pen();
 
        p1.color = blue;
 
 
        Pen p2 = new Pen();
 
        p2.color = black;
 
 
        Pen p3 = new Pen();
 
        p3.color = red;
 
 
        p1.printColor();
 
        p2.printColor();
 
        p3.printColor();
 
    }
 
 }
 
 