import java.util.*;
public class fact {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int i,n,fact=1;
        System.out.println("Enter number to find factorial of:");
        i=sc.nextInt();
        for(n=1;n<=i;n++)
        fact=fact*n;
        System.out.print("The factorial is "+fact+"\n");
             
    }
}
