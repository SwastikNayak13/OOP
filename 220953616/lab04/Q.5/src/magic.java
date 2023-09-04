import java.util.*;
public class magic {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int m,n;
        double w=0,x=0,y=0,z=0;
        System.out.println("enter the dimensions of the square matrix");
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        //rowmsum
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                w+=a[i][j];
                x+=a[j][i];
                if(i==j)
                y+=a[i][j];
                if((i+j)==(m-1))
                z+=a[i][j];
              }

            }
        w=w/m;
        x=x/m;
        if(w==x&&w==y&&w==z)
        System.out.println("It's a magic square matrix");
        else System.out.println("not a square matrix");
sc.close();

    }
}
