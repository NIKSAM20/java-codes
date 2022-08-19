import java.util.*;

public class product{
    
    public static int pro(int x, int y){
        return x*y;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x=sc.nextInt();
        System.out.print("Enter second number: ");
        int y=sc.nextInt();

        int p=pro(x,y);
        System.out.println("Product of the numbers is: "+p);
    }
}