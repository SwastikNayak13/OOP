import java.util.*;
public class sum {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j,k=0;
        System.out.println("enter the dimensions of the array");
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter the elements of the array");
        for( i=0;i<m;i++){
            for( j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        if(m==n){
        System.out.println("The non principal diagonal elements are");
        for( i=0;i<m;i++){
            for( j=0;j<n;j++){
                if((i+j==m-1)){
                    System.out.print(a[i][j]+" ");
                    k+=a[i][j];
                }}}System.out.println("\nThe sum of the non principal diagonal elements is "+k);}
                else System.out.println("Not a square matrix");
                sc.close();
           
     }
}
