import java.util.*;
public class cal {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        float a,b;
        char c,d;
       

        do{
            System.out.println("Enter a number,operator and second number");
        a=sc.nextFloat();
        c=sc.next().charAt(0);
        b=sc.nextFloat();
            switch(c){
                case '+':System.out.println("Sum="+(a+b));
                break;
                case '-':System.out.println("Difference="+(a-b));
                break;
                case '*':System.out.println("Product="+(a*b));
                break;
                case '/':if(b==0)
                System.out.println("Cannot divide by zero");
                else
                System.out.println("Quotient="+(a/b));
                break;
                default : System.out.println("Invalid operator");
                break;
            } System.out.println("enter y to do another calculation");
               d=sc.next().charAt(0);
            
        }while(d=='y');
    }
}
