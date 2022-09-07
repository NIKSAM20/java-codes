class Demo1{
    private void print(){
        System.out.println("In Demo1 class");
    }
}

class Demo2 extends Demo1{
    
}

public class OverRiding {
    public static void main(String args[]){

        Demo2 d = new Demo2();
        d.print();
    }
}
