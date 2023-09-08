import java.util.*;
class box {
 double width;
 double height;
 double depth;

 double vol(){
    return width*depth*height;
 }
}

class boxquestion{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        box mybox=new box();
        System.out.println("Enter the width of the box");
        mybox.width=sc.nextDouble();
        System.out.println("Enter the height of the box");
        mybox.height=sc.nextDouble();
        System.out.println("Enter the depth of the box");
        mybox.depth=sc.nextDouble();
        double v=mybox.vol();
        System.out.println("volume of the box is" +v);
        sc.close();

    }
}
