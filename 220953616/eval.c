#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define size 100
char stack[size];
char infix[size];
char postfix[size];
int top=-1;

typedef enum{lparen,rparen,plus,minus,times,divide,mod,eos,operand}precedence;

int isp[]={0,19,12,12,13,13,13,0};
int icp[]={20,19,12,12,13,13,13,0};


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

void postfixed(){
push('#');

int i=0;
int j=0;
precedence temp;

while(infix[i]!='\0')
    {
        temp=get_token(infix[i]);
        if(temp==operand)
            postfix[j++]=infix[i];


    else if(temp==rparen){
        while(stack[top]!='('){
                postfix[j++]=pop();
              }pop();
    }

    else{
        while(icp[temp]<=isp[get_token(stack[top])]){
            postfix[j++]=pop();
        }
        push(infix[i]);
    }
     i++;
}

while(stack[top]!='#')
    postfix[j++]=pop();



}

int main(){
printf("Enter the infix expression: ");
    scanf("%s",&infix);


postfixed();
printf("The postfix expression is: %s",postfix);
}

