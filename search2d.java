import java.util.*;
public class search2d {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int m=sc.nextInt();
        System.out.print("Enter the numbe of columns: ");
        int n=sc.nextInt();
        int matrix[][]=new int[m][n];

        System.out.println("Enter the elements: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter the element to be searched: ");
        int x=sc.nextInt();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if (x==matrix[i][j]){
                    System.out.println("x found at ("+i+","+j+")");
                }
            }
        }
    }  
}
