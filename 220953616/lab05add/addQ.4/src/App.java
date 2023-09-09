class stack{
 int maxsize;
 int top;
 int []arr;

 stack(int m){
    maxsize=m;
    arr=new int[maxsize];
    top=-1;

 }


void push(int value){
    if(isFull()){
        System.out.println("Stack is full");
    }
    else{
        arr[++top]=value;
    }
}

int pop(){
    if(isEmpty()){
        System.out.println("Stack is empty");
        return -1;
    }
    else{
        int p;
        p=arr[top--];
        return p;
    }
}

boolean isEmpty(){
    return top==-1;
}

boolean isFull(){
    return top==maxsize-1;
}
void display(){
    if(top==-1){
    System.out.println("Stack is empty");
    return;}
    else{
        System.out.println("The element on the stack are");
        for(int i=top;i>=0;i--)
        System.out.println(arr[i]);
    }
}
}

class stacktest{
  public static void main(String[] args) {
        stack stack=new stack(5);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.display();
    }
}
