import java.util.*;
public class apna1q4 {
    public static float circum(float radius){
        return (44*radius)/7;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the radius: ");
        float radius=sc.nextFloat();

        System.out.println("Circumference is: "+circum(radius));
    }
}
