import java.util.*;
public class fibona {
    public static void printFibo(int a, int b, int n){
        if(n==0){
            return;
        }
        
        int c=a+b;
        System.out.println(c);
        printFibo(b,c,n-1);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n= sc.nextInt();

        int a=0;
        int b=1;

        System.out.println(a);
        System.out.println(b);
        printFibo(a,b,n-2);
    }
}
