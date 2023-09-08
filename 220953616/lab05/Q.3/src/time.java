import java.util.*;
class time {
    int hour;
    int min;
    int sec;

    void time0(){
        hour=0;
        min=0;
        sec=0;
    }

    void time1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the hour");
        hour=sc.nextInt();
        System.out.println("Enter the minutes");
        min=sc.nextInt();
        System.out.println("Enter the seconds");
        sec=sc.nextInt();
            }

    void display(){
        System.out.println("the time is "+hour+":"+min+":"+sec);
    }

    
    void add(time a,time b){
        
        hour=a.hour+b.hour;
        min=a.min+b.min;
        sec=a.sec+b.sec;
        while(sec>60){
            sec-=60;
            min++;
        }
        while(min>60){
        min-=60;
        hour++;}
        display();
       
    
    }
}

class times{
    public static void main(String args[]){
        time t1=new time();
        time t2=new time();
        t1.time1();
        
        t2.time1();
        
        

        time t3=new time();
        t3.add(t1,t2);
         
}}
