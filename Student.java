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
 
       Students s1 = new Students();
       s1.name = "Aman";
       s1.age = 24;
       s1.getInfo();
 
 
       Students s2 = new Students();
       s2.name = "Shradha"; 
       s2.age = 22; 
       s2.getInfo();
    }
}