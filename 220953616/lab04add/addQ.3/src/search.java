import java.util.*;
public class search {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n,m,k=0;
        System.out.println("Enter the number of elements:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter the element to search");
        m=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==m)
            k+=1;
            
        }if(k>=1)
        System.out.println("Element found a total of "+k+" time(s)");
        else System.out.println("Element not found");
        sc.close();
    }
}
