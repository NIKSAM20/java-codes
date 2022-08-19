import java.util.*;
public class string1 {
    public static void main(String args[]){
        StringBuilder sb= new StringBuilder("Nikhil");
        System.out.println(sb); 

        System.out.println(sb.charAt(0));

        sb.setCharAt(0,'A');
        System.out.println(sb);

        sb.insert(6,'S');
        System.out.println(sb);

        sb.delete(0,1);
        System.out.println(sb);

        sb.insert(0, 'N');
        System.out.println(sb);


    }
}
