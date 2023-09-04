import java.util.*;
public class sl {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int m,largest=0,smallest=0;
        System.out.println("Enter the number of elements");
        m=sc.nextInt();
        int a[]=new int[m];
        
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++)
        a[i]=sc.nextInt();
        for(int i=1;i<m;i++){
            if(a[i]>a[i-1])
            largest=a[i];
           
            
        }System.out.println("The largest number is:");
        if(largest>a[0])
        System.out.println(largest);
        else System.out.println(a[0]);


        for(int i=1;i<m;i++){
            if(a[i]<a[i-1])
            smallest=a[i];
           
            
        }System.out.println("The smallest number is:");
        if(smallest<a[0])
        System.out.println(smallest);
        else System.out.println(a[0]);
    }
}