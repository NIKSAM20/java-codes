public class newcal{

    int cal(int x, int y, String o){
        if(o.equals("+")){
            return x+y;
        }
        else if(o.equals("-")){
            return x-y;
        }
        else if(o.equals("*")){
            return x*y;
        }
        else {
            return x/y;
        }
    }
    public static void main(String args[]){
        
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[2]);
        String o= args[1];

        newcal s= new newcal();
        int ans=s.cal(x,y,o);
        System.out.print("The result is: "+ans);
    }
}