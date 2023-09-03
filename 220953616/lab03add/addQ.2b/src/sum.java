import java.util.*;
public class sum {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        double i,j,k=2,sum=0;
        System.out.println("enter the number of terms to be calculated");
        i=sc.nextDouble();
        sc.close();
        if(i>1){
            for(j=1;j<i;j++,k++){
                sum+=Math.pow((1/k),k);
            }sum=1+sum;
            System.out.println(sum);
        }
        else System.out.println(1);
    }
}
