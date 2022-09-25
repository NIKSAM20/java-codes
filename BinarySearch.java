import java.util.*;
public class BinarySearch {

    public static int search(int Arr[], int l, int h, int key){
        if (l==h){
            if(Arr[l]==key){
                return h;
            }
            else{return -1;}    
        }

        else{
            int mid=(l+h)/2;
            if(Arr[mid]==key){
                return mid;
            }
            else if(key<Arr[mid]){
                return search(Arr, l, mid-1, key);
            }
            else if(key>Arr[mid]){
                return search(Arr, mid+1, h, key);
            }
            else{return -1; }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n= sc.nextInt();

        int Arr[]=new int[n];
        System.out.print("Enter the elements: ");
        for (int i=0; i<n; i++){
            Arr[i]=sc.nextInt();
        }

        System.out.print("Enter the key: ");
        int key=sc.nextInt();
        int l=0;
        int index= search(Arr, l, n-1, key);        
        System.out.println("The key is at index: "+index);
    }    
}
