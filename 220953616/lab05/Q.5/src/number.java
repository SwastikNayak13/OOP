class Number{
   private double num;

   Number(int i){
    num=i;
   }

   boolean isZero(){
    return(num==0);
   }
    boolean isPositive(){
        return (num>0);
    }
    boolean isNegative(){
        return (num<0);
    }
    boolean isOdd(){
        return (num%2!=0);
    }
    boolean isEven(){
        return (num%2==0);
    }
    boolean isPrime(){
        double i;
        for(i=2.0;i<num;i++){
            if(num%i==0) return false;
            
        }return true;
    }
    boolean isArmstrong(){
       int n=(int)num;
        int j=(int)num;
        int i=0;
        int rem;
        int c=0,k,d;

        while(num!=0){
            
            i++;
            num=(int)num/10;

        }
     while(n!=0){
        rem=n%10;
        k=1;
        for(d=1;d<=i;d++)
        k=k*rem;
        c=c+k;
        n=n/10;
     }
     if(c==j)
     return(true);
     else return(false);
    }

    

}

class numtest{
    public static void main(String[] args) {
        Number i=new Number(153);
        System.out.println(i.isZero());
        System.out.println(i.isPrime());
        System.out.println(i.isPositive());
        System.out.println(i.isOdd());
        System.out.println(i.isNegative());
        System.out.println(i.isEven());
        System.out.println(i.isArmstrong());
        




    }
}
