import java.util.Scanner;
import java.lang.*;
class student{
int n;
String name,usn;
int[] credit=new  int[100];
float[] grades=new  float[100];
int[] marks=new  int[100];
float[] product=new  float[100];

void input()
{Scanner scan= new Scanner(System.in);
System.out.println("enter the student usn");
usn=scan.nextLine();
System.out.println("enter the student name");
name=scan.nextLine();
System.out.println("enter number of subjects");
n=scan.nextInt();
System.out.println("enter credits for all subjects");
for (int i=0;i<n;i++)
{credit[i]=scan.nextInt();}
System.out.println("enter marks for all subjects");

for ( int j=0;j<n;j++)
{marks[j]=scan.nextInt();}
}

double calculate()
{float sum=0;
int csum=0;
for (int i=0;i<n;i++)
{grades[i]= marks[i]/10;}

for (int i=0;i<n;i++)
{product[i]= credit[i] * grades[i];
}
for (int i=0;i<n;i++)
{sum= sum + product[i];
csum= csum + credit[i];
}
return (sum/csum);
}

void output()
{System.out.println("student details are");
System.out.println("usn: " + usn);
System.out.println("name: " + name);



System.out.println("sgpa : " +  calculate() );}

public static void main(String args[])
{student s1 = new student();
s1.input();
s1.output();
}
}



