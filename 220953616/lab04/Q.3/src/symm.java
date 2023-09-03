import java.util.*;
public class symm{
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j,k=0;
        System.out.println("enter the dimensions of the matrix");
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter the elements of the matrix");
        for( i=0;i<m;i++){
            for( j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        if(m==n){
          for( i=0;i<m;i++){
            for( j=0;j<n;j++){
                if(a[i][j]==a[j][i]){
                    k+=1;
                }
        }}if(k==m*n)
    System.out.println("It is a symmetric matrix");
else System.out.println("Not a symmetric matrix");}
                else System.out.println("Not a square matrix");
                sc.close();
           
     }
}

