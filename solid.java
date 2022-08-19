import java.util.*;

public class solid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c=sc.nextInt();
        
        for(int i=0; i<r; i++){
            for(int j=0;j<c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
