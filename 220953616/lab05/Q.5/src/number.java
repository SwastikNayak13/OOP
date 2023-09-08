class Number{
   private double num;

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
        double temp=num;
        double result=0;
        while(temp!=0){
            result =+ Math.pow(temp%10,3);
            temp/=10;
        }
        if(result==num) return true;
        return false;
    }

}
