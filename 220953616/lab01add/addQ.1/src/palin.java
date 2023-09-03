import java.util.*;
public class palin {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int a,c=0,rem;
        System.out.println("Enter the number :");
        a=sc.nextInt();
        int b=a;
        while(a!=0){
            rem=a%10;
            c=c*10+rem;
            a=a/10;
        }
        if(c==b)
        System.out.println("The number is a palindrome");
        else
        System.out.println("The number is not a palindrome");

    }
}
