import java.util.*;
public class merge {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int m,n,j,i;
        System.out.println("Enter the number of elements in array 1");
        m=sc.nextInt();
        int a[]=new int[m];

        System.out.println("Enter the number of elements in array 2");
        n=sc.nextInt();
        int b[]=new int[n];
        
        System.out.println("Enter the elements of array 1");
        for( i=0;i<m;i++)
        a[i]=sc.nextInt();

        System.out.println("Enter the elements of array 2");
        for( i=0;i<n;i++)
        b[i]=sc.nextInt();

        int k=m+n;
        int c[]=new int[k];
        
        for(j=0;j<m;j++)
            c[j]=a[j];
        

        for( i=0;i<n;i++,j++)
            c[j]=b[i];
        
           // System.out.print("\n");
        //for(i=0;i<k;i++)
        //System.out.print(c[i]+" ");

        //bubble sort
        for( i=0;i<k-1;i++){
            int flag=0;
            for(j=0;j<k-1-i;j++){
                if(c[j]>c[j+1]){
                    int temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                    flag=1;
                }

            }if(flag==0)break;
        }System.out.print("\n");
        for( i=0;i<k;i++)
        System.out.print(c[i]+" ");
        
       
    }
}