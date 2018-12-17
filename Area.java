import java.util.Scanner;
class Area
{
public static void main(String args[])
{
int r;
double a;
Scanner s = new Scanner(System.in);
System.out.println("enter the radius");
r = s.nextInt();
System.out.println("area is " +(3.14*r*r));
}
}