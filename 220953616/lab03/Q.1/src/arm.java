import java.util.*;
public class arm {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int a,i=0,n,rem,k,j,d,c=0;
        System.out.println("Enter an integer: ");
        a=sc.nextInt();
        n=a;
        j=a;

        while(a!=0){
            
            i++;
            a=a/10;

        }
     while(n!=0){
        rem=n%10;
        k=1;
        for(d=1;d<=i;d++)
        k=k*rem;
        c=c+k;
        n=n/10;
     }
     if(c==j)
     System.out.println("It's an armstrong number");
     else System.out.println("Not an armstrong number");

    }
}
