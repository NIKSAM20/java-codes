class add{
    int a,b;
    void addition(int x, int y){
        System.out.println(x+y);
    }

    void addition(float x, float y){
        System.out.println(x+y);
    }
}

public class Overloading {
    public static void main(String args[]){
        add a1=new add();
        a1.addition(10,20);

        add a2=new add();
        a2.addition(10.5f,20.5f);


    }
    
}
