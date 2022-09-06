import java.util.*;
public class selection_sort {
    void array(int arr[], int n ){
        
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n= sc.nextInt();

        int arr[]= new int[n];
        System.out.print("Enter the values of the array: ");
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        selection_sort a1 =new selection_sort();
        a1.array(arr,n);
    }
}