import java.util.*;
public class search {
    public static void main(String[] args) throws Exception {
        int[]num={1,6,2,3,1,7,2,3,4,4,4,6,7};
        int i,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to search:");
        i=sc.nextInt();
        sc.close();

        System.out.print("The value is found at the locations: ");
        for (int j : num) {
            if(j==i)
            System.out.print("num["+k+"] ");
            k++;

            
        }

    }
}
