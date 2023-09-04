import java.util.*;
public class addmultiply {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int m,n,a,b,i,j,s,k;
        int c[][]=new int[30][30];
        char d,e;
       do{ System.out.println("Enter + for addition or * for multiplication");
        d=sc.next().charAt(0);
        switch(d){
       case '+' :  System.out.println("Enter the dimensions of matrix 1");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("Enter the dimensions of matrix 2");
        a=sc.nextInt();
        b=sc.nextInt();
        int x[][]=new int[m][n];
        int y[][]=new int[a][b];
        System.out.println("Enter the elements of matrix 1");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                x[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix 2");
        for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                y[i][j]=sc.nextInt();
            }
        }
        if((m==a)&&(n==b)){
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                 c[i][j]=x[i][j]+y[i][j];   
                }
            }System.out.println("The matrix after addition is:");
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    System.out.print(c[i][j]+" ");
                } System.out.print("\n");
            }

        }
        else System.out.println("Dimensions don't match, addition is not possible");break;
       
        case '*': System.out.println("Enter the dimensions of matrix 1");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("Enter the dimensions of matrix 2");
        a=sc.nextInt();
        b=sc.nextInt();
        int x1[][]=new int[m][n];
        int y1[][]=new int[a][b];
        System.out.println("Enter the elements of matrix 1");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                x1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix 2");
        for(i=0;i<a;i++){
            for(j=0;j<b;j++){
                y1[i][j]=sc.nextInt();
            }
        }
        if(n==a){
            for(i=0;i<m;i++){
                for(j=0;j<b;j++){
                    s=0;
                    for(k=0;k<n;k++){
                        s+=x1[i][k]*y1[k][j];
                        c[i][j]=s;
                    }
                }
            }System.out.println("The matrix after multiplication is :");
            for(i=0;i<m;i++){
                for(j=0;j<b;j++){
                    System.out.print(c[i][j]+" ");
                }System.out.print("\n");
            }

        }
        else System.out.println("Number of rows and columns don't match");
        break;

        default: System.out.println("invalid opertor");break;
    
    } System.out.println("Do you want to continue (y/n)?");
    e=sc.next().charAt(0);

}while(e=='y');
}}
