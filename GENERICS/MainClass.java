import java.util.*;
class TwoGen<T, V> {
T ob1;
V ob2;
TwoGen(T o1, V o2) {
ob1 = o1;
ob2 = o2;
}

void showTypes() {
System.out.println("Type of T is " +ob1.getClass().getName());
System.out.println("Type of V is " +ob2.getClass().getName());
}
T getob1() {
return ob1;
}
V getob2() {
return ob2;
}
}

class MainClass{
public static void main(String args[]){
int a;
String b;
Scanner scan = new Scanner(System.in);
System.out.println("Enter a INTEGER");
a = scan.nextInt();
scan.nextLine();
System.out.println("Enter a STRING");
b = scan.nextLine();
TwoGen<Integer,String> obj = new TwoGen<Integer,String>(a,b);
obj.showTypes();
int v = obj.getob1();
System.out.println("value: " + v);
String str = obj.getob2();
System.out.println("value: " + str);
}
}
