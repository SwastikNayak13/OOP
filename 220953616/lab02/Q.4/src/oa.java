public class oa {
    public static void main(String[] args) throws Exception {
        int x=10;
        double y=x;
        System.out.println(y);
        //prints 10.0

        /*double x1=10.5;
        int y1=x1;
        System.out.println(y1);*/
        //cannot convert from double to int

        double x2=10.5;
        int y2=(int)x2;
        System.out.println(y2);
        //prints 10
    }
}
