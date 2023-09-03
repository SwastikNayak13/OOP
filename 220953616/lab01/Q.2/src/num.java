import java.util.*;
public class num {
    public static void main(String[] args) throws Exception {
        int a,i,k=0,j=0,m=0;
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter 10 numbers: ");
       for(i=0;i<10;i++){
       a=sc.nextInt();
        if(a>0)
        k=k+1;
        else if(a<0)
        j=j+1;
        else
        m=m+1;
       }
       System.out.println("The number of negative, positive and zeroes is "+k+", "+j+" and "+m);

        
    }
}
