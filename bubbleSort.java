import java.util.*;
public class bubbleSort{
    public static void printArr(int arr[]){
        for( int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]){
        int arr[]= {8,5,9,2,6};
        
        for( int i=0; i<arr.length-1; i++){
            for( int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArr(arr);
    }
}
