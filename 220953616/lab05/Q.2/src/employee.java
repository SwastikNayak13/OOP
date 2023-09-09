import java.util.*;
class employee {
    String name;
    String city;
    double salary;
    double DA;
    double HRA;

    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name");
        name=sc.nextLine();
        System.out.println("Enter employee city");
        city=sc.nextLine();
        System.out.println("Enter basic salary");
        salary=sc.nextDouble();
        System.out.println("Enter dearness allowance");
        DA=sc.nextDouble();
        System.out.println("Enter house rent allowance");
        HRA=sc.nextDouble();
        sc.close();
    }

    double calculate(){
        return salary+salary*DA/100+salary*HRA/100;
    }

    void display(){
        System.out.println("Total salary is "+calculate());
    }
}

class emp{
    public static void main(String args[]){
        employee man=new employee();
        man.getdata();
        man.display();
    }

}
