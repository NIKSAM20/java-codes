import java.util.*;
public class calculator{

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        
        int x=Integer.parseInt(args[0]);
        
        int y=Integer.parseInt(args[1]);          

        System.out.print("Enter the operator: ");
        String s=sc.next();
        
        if(s.equals("+")){
            System.out.println(x+y);
        }

        else if(s.equals("-")){
            System.out.println(x-y);
        }

        else if(s.equals("*")){
            System.out.println(x*y);
        }

        else {
            System.out.println(x/y);
        }
    }
}