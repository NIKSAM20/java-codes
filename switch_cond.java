import java.util.*;
public class switch_cond {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the button: ");
        int button=sc.nextInt();

        switch(button){
            case 1:
            System.out.println("Hello");
            break;

            case 2:
            System.out.println("Namaste");
            break;

            case 3:
            System.out.println("Bonjour");
            break;
            
            default:
            System.out.println("Wrong choice");
        }     
    }    
}
