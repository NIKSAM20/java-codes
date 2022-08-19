import java.util.*;

import javax.xml.transform.Source;
public class apna1q3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter x: ");
        int x=sc.nextInt();

        System.out.print("Enter y: ");
        int y=sc.nextInt();

        if(x>y){
            System.out.println("x is greater");
        }
        else if(x==y){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("y is greater");
        }
    }

}
