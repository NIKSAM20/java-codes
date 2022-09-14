class DemoEx{
    int length;
    int width;

    DemoEx(int x, int y){
        length =x;
        width =y;
    }
    void area(){
        System.out.println(length*width);
    }
}

public class DemoAr{
    public static void main(String args[]){
        DemoEx d1=new DemoEx(8,4);
        d1.area();
    }
}