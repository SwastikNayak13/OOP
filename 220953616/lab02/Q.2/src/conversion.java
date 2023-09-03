import java.util.*;
public class conversion {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int a;
        double b;
        char c;
        System.out.println("Enter a integer:");
        a=sc.nextInt();
        System.out.println("Enter a double:");
        b=sc.nextDouble();
        System.out.println("Enter a charcter:");
        c=sc.next().charAt(0);
        //int to byte
        byte d=(byte)a;
        //char to int;
        int e=(int)c;
        //double to int
        int f=(int)b;
        //double to byte
        byte g=(byte)b;

        System.out.println("Int to byte:"+d);
        System.out.println("Char to int:"+e);
        System.out.println("Double to int:"+f);
        System.out.println("double to byte:"+g);

    }
}
