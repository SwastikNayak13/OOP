import java.util.*;
public class ternary {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int a,b,c,e,f;
        System.out.println("Enter three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        e=a>b?a:b;
        f=e>c?e:c;
        System.out.println("The largest number is: "+f);
        e=a<b?a:b;
        f=e<c?e:c;
        System.out.println("The smallest number is: "+f);



        
    }
}
