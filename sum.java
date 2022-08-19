import java.util.*;
public class sum{
    int add(int x, int y){
        return x+y;
    }

    public static void main(String args[]){
        int ans;
        Scanner sc= new Scanner(System.in);
        sum s1=new sum();
        System.out.print("Enter first number: ");
        int m= sc.nextInt();

        System.out.print("Enter first number: ");
        int n= sc.nextInt();
        ans=s1.add(m,n);
        System.out.println(ans);       
    }
}