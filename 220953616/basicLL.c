#include<stdio.h>
#include<stdlib.h>
struct node{
int data;
struct node *next;}*new,*head,*tail;
int n,x,i,z,k;


void create(int data){
new=(struct node*)malloc(sizeof(struct node));
new->data=data;
new->next=NULL;

if(head==NULL){
    head=new;
    tail=new;
    }
else{
    tail->next=new;
    tail=new;
    }
}

void reverse(){
struct node* t1=NULL;
struct node *t2=NULL;
while(head!=NULL){
    t2=head->next;
    head->next=t1;
    t1=head;
    head=t2;
}head=t1;
display();}

void delete(){
printf("Enter the element to delete ");
scanf("%d",&k);
struct node* t1;
struct node* t2;
if(k==1){
t1=head->next;
head->next=NULL;
head=t1;
}

else if(k==x){
    t1=head;
    while(t1->next!=tail)
    t1=t1->next;
    t1->next=NULL;
    tail=t1;
}

else{t1=head;
    for(i=1;i<k-1;i++)
        t1=t1->next;
    t2=t1;
    t1=t1->next;
    t2->next=t1->next;
    t1->next=NULL;
}

display();
}

display(){
    printf("The LINKED LIST is: ");
    struct node* temp=head;
while(temp!=NULL){
    printf("%d ",temp->data);
    temp=temp->next;
}printf("\n");}

void main(){
    printf("Enter the total elements of the LL\n");
    scanf("%d",&x);
    for(i=0,k=1;i<x;i++,k++){
        printf("Enter the data no.%d ",k);
        scanf(" %d",&z);
        create(z);
    }display();




    do{printf("\nChoose the option\n1) Insert an element before another element in the existing list\n2) Insert an element after another element in the existing list\n3) Delete a given element from the list\n4) Traverse the list\n5) Reverse the list\n6) Sort the list\n7) Delete every alternate node in the list\n8) Insert an element in a sorted list such that the order is maintained\n9) Display\n10) EXIT\n\n");
    scanf("%d",&n);
    switch(n){
    case 1:
    case 2:
    case 3:delete();break;
    case 4:
    case 5:reverse();break;
    case 6:
    case 7:
    case 8:
    case 9:display();break;
    case 10:exit(0);
    default:printf("Invalid option\n");}
}while(1);
}

