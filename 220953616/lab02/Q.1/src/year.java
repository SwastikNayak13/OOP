import java.util.*;
public class year{
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.print("enter the year:");
        a=sc.nextInt();
        boolean leap=false;
        if(a%4!=0)
        leap=false;
        else if(a%100!=0)
        leap=true;
        else if(a%400!=0)
        leap=false;
        else
        leap=true;

        if(leap)
        System.out.print(a+" is a leap year\n");
        else
        System.out.print(a+" is not a leap year\n");
        

    }
}
