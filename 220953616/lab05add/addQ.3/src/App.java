class swap {
    int a;
    int b;


    swap(int x,int y){
        a=x;
        b=y;
    }}

   



   

class swapped{
    public static void main(String[] args){
        swap z=new swap(2, 3);
        byvalue(2, 3);
        swapbyref(z);
    }
     static void swapbyref(swap s){
        int temp=s.b;
        s.b=s.a;
        s.a=temp;
        System.out.println("After swap "+s.a+" and "+s.b);
    }
     static void byvalue(int x,int y){
        int z;
        z=x;
        x=y;
        y=z;
        System.out.println("After swap "+x+" and "+y);
    }
}

