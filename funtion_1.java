import java.util.*;

public class funtion_1 {

    public static void printMyName(String name){
        System.out.println("Your name is: "+name);
       
    }


    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name=sc.next();
        printMyName(name);
    }
}
