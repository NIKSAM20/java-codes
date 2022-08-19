import java.util.*;
public class maxmin {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n=sc.nextInt();

        int arr[]= new int[n];
        System.out.println("Enter the values: ");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int max=arr[0],min=arr[0];
        for(int i=0; i<n; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Maxium is: "+max);

        for(int i=0; i<n; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Minium is: "+min);        
    }
}
