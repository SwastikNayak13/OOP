#include<stdio.h>
#define max 100
typedef struct {
int row;
int col;
int val;
}sparse;
sparse s[max];
int main(){
int i,j,n,m,a[30][30];
printf("Enter the number of rows ");
scanf(" %d",&m);
printf("\nEnter the number of columns ");
scanf(" %d",&n);
printf("Enter the elements of the sparse matrix ");
for(i=0;i<m;i++){
    for(j=0;j<n;j++){
        scanf(" %d",&a[i][j]);
    }
  }
s[0].row=m;
s[0].col=n;
int k=0;

for(i=0;i<m;i++){
    for(j=0;j<n;j++){
        if(a[i][j]!=0){
                k++;
            s[k].row=i;
            s[k].col=j;
            s[k].val=a[i][j];
        }
    }
}
s[0].val=k;
//printf("%d %d %d",s[0].col,s[0].row,s[0].val);

transpose(s);

}


void transpose(sparse a[]){
sparse b[max];
int i,j;
b[0].row=a[0].col;
b[0].col=a[0].row;
b[0].val=a[0].val;

int non_zero[max];
int starting_pos[max];
for(i=0;i<a[0].col;i++){
    non_zero[i]=0;
}
for(i=1;i<=a[0].val;i++)
    non_zero[a[i].col]++;
starting_pos[0]=1;
for( i=1;i<b[0].row;i++)
    starting_pos[i]=starting_pos[i-1]+non_zero[i-1];
for( i=1;i<=a[0].val;i++){
    j=starting_pos[a[i].col]++;
    b[j].row=a[i].col;
    b[j].col=a[i].row;
    b[j].val=a[i].val;
}
display(b);}

void display(sparse b[]){
printf("The row number, column number and the value of the transpose matrix is");
int i;
for(i=1;i<=b[0].val;i++){
    printf("\n%d %d %d",b[i].row,b[i].col,b[i].val);}
}
