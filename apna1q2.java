import java.util.*;
public class apna1q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                sum=sum+i;
            }   
        }
        System.out.print("Sum of odd numbers is: "+sum);
    }
}
