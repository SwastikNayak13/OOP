 import java.util.Scanner;
 class Book {
    String title;
    String author;
    int edition;


Book(String t,String a,int e){
    title=t;
    author=a;
    edition=e;
}}



class boo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Book books[]=new Book[6];
        System.out.println("Enter the details of the books: Title,author name,edition");
        for(int i=0;i<6;i++){
            String T=sc.nextLine();
            String A=sc.nextLine();
            int e=sc.nextInt();

            Book book=new Book(T, A, e);
            books[i]=book;
        }
            System.out.println("Enter the author name to display the books");
            String au=sc.nextLine();

            for(int i=0;i<6;i++){
                if(books[i].author==au){
                    System.out.println("book: "+books[i].title+"\nEdition: "+books[i].edition);
                }
            }
    }
}