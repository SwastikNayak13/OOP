class complex{
    int img;
    int real;
    
complex(int r,int i){
    real=r;
    img=i;
}
complex add(int num,complex num1){
    complex c= new complex(num+real,img);
    return c;
}
complex add(complex num1,complex num2){
    complex c= new complex(real+real, img+img);
    return c;

}
void display(){
    System.out.println(real+"+i"+img);
}}

class comp{
    public static void main(String args[]){
        complex c1=new complex(3,2);
        complex c2=new complex(5,7);

        complex c3= c1.add(4,c1);
        c3.display();

        c3=c2.add(c2, c3);

        c3.display();


    }

}

