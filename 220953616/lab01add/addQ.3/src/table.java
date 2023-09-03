import java.util.*;
public class table {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int a,i,j;
        System.out.print("Enter the number to find the table of: ");
        a=sc.nextInt();
        System.out.println("The table is");
        for(i=1;i<=10;i++){
            j=a*i;
            System.out.println(a+"x"+i+"="+j);
        }



    }
}
