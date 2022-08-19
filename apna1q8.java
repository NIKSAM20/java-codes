import java.util.*;
public class apna1q8 {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number: ");
        int x=sc.nextInt();

        System.out.print("Enter the power: ");
        int n=sc.nextInt();

        int power=1;
        for(int i=1; i<=n; i++){
            power=power*x;
        }
        System.out.println("X raised to n is: "+power);
    }
}
