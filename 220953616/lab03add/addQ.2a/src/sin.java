import java.util.*;
public class sin {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        double x,result=0,j=3;
        int n,i,sign=-1,fact=1,k;
        System.out.println("Enter x in radians");
        x=sc.nextDouble();
        System.out.println("Enter the number of terms you want to calculate");
        n=sc.nextInt();
        sc.close();
        if(n>1){
            for(i=1;i<n;i++,j+=2){
                for(k=1;k<=j;k++){
        fact=fact*k;}
            result+=sign*Math.pow(x,j)/fact;
            sign*=-1;
            fact=1;
}result=x+result;
System.out.println(result);}
else System.out.println(x);
}
}
