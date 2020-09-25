import java.lang.Math;
class shape{
public static void main(String args[])
{
int i=2,r=5,h=5;
double area=0,volume=0;
System.out.println("select the shape of your choice\n" +"enter 1 for cone\n" + "enter 2 for cylinder\n" + "enter 3 for sphere\n");
if(i==1)
{
System.out.println("enter the radius and  height of the cone");
area=3.14*r*(r+Math.sqrt((r^2)+(h^2)));
volume=(3.14*(r^2)*h)/3;
}
else if(i==2)
{System.out.println("enter the radius and  height of the cylinder");
area=2*3.14*r*(h+r);
volume=3.14*(r^2)*h;
}
else if(i==3)
{System.out.println("enter the radius of the sphere");
area=4*3.14*(r^2);
volume=(4/3)*3.14*(r^3);
}
System.out.println("volume=" + volume);
System.out.println("area =" + area);
}
}
