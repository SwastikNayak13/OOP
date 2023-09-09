class Result {
    int a[][];
    int b[];
    int rollno[];


    Result(int a1[][], int r[],int v[]){
      a=a1;
      rollno=r;
      b=v;
        
    }

    void add(){
        int sum=0;
        for(int i=0;i<3;i++){
            sum=0;
            for(int j=0;j<3;j++){
                sum+=a[i][j];
            }b[i]=sum;
        }
    }


void highest(){
    int g=rollno[0],i,k=1,j=0;
  for(i=0;i<3;i++){
    int high=a[0][i];
    for( j=0;j<3;j++){
      if(a[j][i]>high){
      high=a[j][i];
       g=rollno[j];
    }
    }System.out.println("Highest marks in subject "+k+++" is "+high+" by roll number "+g);
  }


}

void hightotal(){
    int i,high=b[0],h=0;
    for(i=0;i<3;i++){
        if(b[i]>high){
        high=b[i];
    h=i;}}
        
    System.out.println("Highest marks obtained by roll no "+rollno[h]+" total " +high);
}
}

class stu{
    public static void main(String args[]){
        int marks[][]={{100,87,65},{99,100,98},{50,83,45}};
        int roll[]={54,55,56};
        int p[]={0,0,0};
        Result w=new Result(marks,roll,p);
        w.add();
        w.highest();
        w.hightotal();
    }
}
