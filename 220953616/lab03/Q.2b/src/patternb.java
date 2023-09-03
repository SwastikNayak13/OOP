import java.util.*;
public class patternb {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the number of rows");
        n=sc.nextInt();
        sc.close();
        int a[]=new int[n];
        int i=1;
    for (int j : a) {
        int b[]=new int[i];
        for (int k : b) {
            System.out.print(i+" ");   
        }
        i++;
        System.out.println("\n");
    }
    }
}
