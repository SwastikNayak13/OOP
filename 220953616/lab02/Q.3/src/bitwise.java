import java.util.*;
public class bitwise {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        int a;
        System.out.println("enter the number:");
        a=sc.nextInt();
        System.out.println("multiplication: "+(a<<1));
        System.out.println("division: "+(a>>1));
    }
}
