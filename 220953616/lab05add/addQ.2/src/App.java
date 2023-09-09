import java.util.*;

class array {
  int a[]=new int[10];

  array(int b[]){
    for(int i=0;i<10;i++){
        a[i]=b[i];
    }
  }

  void display(){
    for(int i=0;i<10;i++)
    System.out.print(a[i]+" ");
  }

  void large(){
    int largest=a[0];
    for(int value:a){
        if(value>largest)
        largest=value;
    }
    System.out.println("\nLargest number is "+largest);
  }

  void average(){
    int sum=0;
    for(int value:a){
        sum+=value;
    }double sum1=(double)sum/10;
    System.out.println("Average="+sum1);
  }

  void sort(){
    Arrays.sort(a);
    for (int i : a) {
        System.out.print(i+" ");
    }
  }
}

class integer{
    public static void main(String args[]){
        int arr[]={1,4,3,5,2,7,8,6,9,0};
        array b=new array(arr);
        b.display();
        b.large();
        b.average();
        b.sort();
    }
}
