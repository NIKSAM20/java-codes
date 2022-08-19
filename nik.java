class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name= n;
    }
}

public class nik {
    public static void main(String args[]){
        //problem 1:
        Employee nikhil = new Employee();
        nikhil.setName("Nikhil Singh");
        nikhil.salary=5000000;
        System.out.println(nikhil.getName());
        System.out.println(nikhil.getSalary());
    }    
}
