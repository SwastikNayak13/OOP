import java.util.*;
public class Area {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        float a,b,c,d;
        System.out.println("Enter the length of the rectangle: ");
        a=sc.nextFloat();
        System.out.println("Enter the breadth of the Rectangle: ");
        b=sc.nextFloat();
        c=2*(a+b);
        d=a*b;
        System.out.println("The circumference of he rectangle is: "+c);
        System.out.println("The area of he rectangle is: "+d);
 
    }
}
