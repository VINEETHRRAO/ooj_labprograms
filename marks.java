class marks{
public static void main(String args[])
{int cie=49,see=76,total;
total=cie+(see/2);
if(total>=90 &&total<=100)
System.out.print("student has got 'A+' grade,and mark is" + total);
else if(total>=80 && total<=89)
System.out.print("student has got 'A' grade,and mark is" + total);
else if(total>=60 && total<=79)
System.out.print("student has got 'B' grade,and mark is" + total);
else if(total >=35 && total<=59)
System.out.print("student has got 'C' grade,and mark is" + total);
else
 System.out.print("student has failed.");

}
}




