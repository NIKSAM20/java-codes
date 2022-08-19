import java.util.*;
public class pattern2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Entet the number of rows: ");
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    
}
