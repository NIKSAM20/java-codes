import java.util.*;

public class apna1q1 {
    public static void average(int a, int b, int c){
        int avg=(a+b+c)/3;
        System.out.print("Average of the numbers is: "+avg);        
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        System.out.print("Enter third number: ");
        int c=sc.nextInt();

        average(a,b,c);
    }
}
