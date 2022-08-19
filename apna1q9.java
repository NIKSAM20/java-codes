import java.util.*;
public class apna1q9 {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x=sc.nextInt();

        System.out.print("Enter second number: ");
        int y=sc.nextInt();
        int gcd=1;
        if(x==y){
            System.out.println("gcd of x and y is: "+x);
        }
        else if(x>y){
            for(int i=1; i<=x;i++){
                if(x%i==0 && y%i==0){
                    gcd=i;
                }
            }
            System.out.println("gcd of x and y is: "+gcd);
        }
        else{
            for (int i=1; i<=y; i++){
                if(x%i==0 && y%i==0){
                    gcd=i;                    
                }
            }
            System.out.println("gcd of x and y is: "+gcd);
        }
    }
}
