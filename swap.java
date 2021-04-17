public class swap {


    public static void main(String[] args) {
        System.out.println("with temp variable");
        int a=5;
        int b=6;
        int temp;
        
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
System.out.println("without temp");
        int x=7;
        int y=8;
         x=x+y;
         y=x-y;
         x=x-y;
        System.out.println(x);
        System.out.println(y);

        
    }
    
}
