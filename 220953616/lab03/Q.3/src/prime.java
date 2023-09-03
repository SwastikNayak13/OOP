import java.util.*;
public class prime {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int a,b,c,flag=0;
        System.out.println("enter the lower and upper limit");
        a=sc.nextInt();
        b=sc.nextInt();
        for(c=a+1;c<b;c++){
        for(int i=2;i<b;i++){
            if(c%i==0)
            flag++;

        }if(flag==1)
        System.out.println(c);
        flag=0;
    }
    }
}
