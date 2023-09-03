import java.util.*;
public class result {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int a,b;
        System.out.println("enter value for a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println((a<<2)+(b>>2));
        System.out.println((b>0));
        System.out.println((a+b*100)/10);
        System.out.println((a&b));
    }
}
