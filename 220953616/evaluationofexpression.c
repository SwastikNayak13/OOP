#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define size 100
char stack[size];
char infix[size];
char prefix[size];
int top=-1;

typedef enum{lparen,rparen,plus,minus,times,divide,mod,eos,operand}precedence;

int isp[]={19,0,12,12,13,13,13,0};
int icp[]={19,20,12,12,13,13,13,0};


void push(char c){

if(top==size-1)
    {
        printf("stack is full");
        return;
    }
stack[++top]=c;
}

char pop(){
if (top==-1){
    printf("stack is empty");
    return "99999";
}
return (stack[top--]);}


precedence get_token(char c){
switch (c ){
case '#': return eos;
case '(': return lparen;
case ')': return rparen;
case '+': return plus;
case '-': return minus;
case '*': return times;
case '/': return divide;
case '%': return mod;
default : return operand;}}

void prefixed(int n){
push('#');

int i=n-1;
int j=0;
precedence temp;

while(i>=0)
    {
        temp=get_token(infix[i]);
        if(temp==operand)
            prefix[j++]=infix[i];


    else if(temp==lparen){
        while(stack[top]!=')'){
                prefix[j++]=pop();
              }pop();
    }

    else{
        while(icp[temp]<isp[get_token(stack[top])]){
            prefix[j++]=pop();
        }
        push(infix[i]);
    }
     i--;
}

while(stack[top]!='#')
    prefix[j++]=pop();
   // prefix[j]='\0';


}

int main(){
printf("Enter the infix expression: ");
    scanf("%s",&infix);
    int n=strlen(infix);

prefixed(n);
printf("The prefix expression is: %s",strrev(prefix));
}

