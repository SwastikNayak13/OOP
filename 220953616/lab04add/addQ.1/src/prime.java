import java.util.*;
public class prime {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int m,flag=0;
        System.out.println("Enter the number of elements");
        m=sc.nextInt();
        int a[]=new int[m];
        
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++)
        a[i]=sc.nextInt();
        sc.close();
        for(int i=0;i<m;i++){
          for(int j=1;j<a[i];j++){
            if(a[i]%j==0)
            flag+=1;

           }if (flag==1)
           System.out.println("\n"+a[i]);
           flag=0;  
        }
        
    }
}
