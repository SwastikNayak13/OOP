import java.util.*;
public class pattern {
    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int i,j,n,k=1;
    System.out.println("Enter the number of rows");
    n=sc.nextInt();
    for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
            System.out.print(k+" ");

        }k++;
        System.out.println("\n");
    }

    }
}
