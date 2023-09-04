import java.util.*;
public class tracenorm {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int m,n,j,i,trace=0;
        double norm=0;
        System.out.println("Enter the dimensions of the square matrix");
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        if(m==n){
        System.out.println("Enter the elements of the matrix");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    double d=(double)a[i][j];
                    norm+=Math.pow(d,2);
                    if(i==j)
                    trace+=a[i][j];
                }
            }norm=Math.sqrt(norm);
            System.out.println("Norm="+norm);
            System.out.println("Trace="+trace);


        }
        else System.out.println("The matrix is not square");
    }}

