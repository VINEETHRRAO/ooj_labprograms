
import java.util.Scanner;
import java.lang.*;
class book{
String name;
String author;
double price;
int num_pages;


book(String n,String a,double p,int no)
{
 name=n;
author=a;
price=p;
num_pages=no;
}  

book(){
name="none";
author="none";
price=0.0;
num_pages=0;}


void setdata()
{Scanner scan= new Scanner(System.in);

System.out.println("enter the book name");
name=scan.nextLine();
System.out.println("enter the author name");
author=scan.nextLine();
System.out.println("enter the book price");
price=scan.nextDouble();
System.out.println("enter number of pages");
num_pages=scan.nextInt();}


public String toString()
{return("name of the book:\t"+this.name+"\nauthor of the book:\t"
+ this.author + "\nprice of the book:\t"+ this.price + "\nnumber of pages:\t" + this.num_pages);
}

}

class mainclass{
public static void main(String args[])
{Scanner scan= new Scanner(System.in);
int n;
System.out.println("enter the number of books");
n=scan.nextInt();
book b[]=new book[n];
for(int i=0;i<n;i++)
{b[i]=new book();
 System.out.println("Enter book"+(i+1)+"details:");
 b[i].setdata();
}

System.out.println("The book details are:");
for(int i=0;i<n;i++)
{System.out.println("book "+(i+1)+" :");
 System.out.println(b[i]);}

}
}




