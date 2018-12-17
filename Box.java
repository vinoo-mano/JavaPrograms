import java.util.Scanner;
interface Boxarea{
float area();
}
interface Boxperi extends Boxarea{
double perimeter();
}
class Box implements Boxperi,Boxarea{
float area (int x,int y){
int a,b;
a=x;
b=y;
return a*b;
}
double perimeter (int x ,int y){
int a,b;
a=x;
b=y;
return (2*(a+b));
}
public static void main(String args[]){
Box b= new Box();
System.out.println(b.area(2,3));
System.out.println(b.perimeter(2,3));
}
}
