import java.util.Random;
class ExcHandleError {
public static void main (String args[]) {
int a=0;
int b=0;
int c=0;
Random r= new Random();

for (int i=0; i<32; i++)
{
 try {
      b=r.nextInt();
      c=r.nextInt();
      a=12345/ (b/c);
     } catch(ArithmeticException e) {
       System.out.println("division by zero.");
       a=0;
      }
      System.out.println("a= " +a);
    }
   }
 }

    
------------------------------------------------------------------------------------------
class Exc99 {

public static void main (String args[]) {
int a=0;

try {
for (int d=-1;d<2;d++){
a=10/d;
System.out.println("a="+a);
}
System.out.println("This will not be printed");

} catch(Exception d) {
  System.out.println(d);
  a=1;
 }
System.out.println("after catch statement.");

System.out.println(" when a is infinite a=  "+a); 
 }
}

------------------------------------------------------------------------------------------
import java.util.Scanner;
import java.util.InputMismatchException;
class TestNumber{

public static void main(String args[]) {

int a=0;
String str;
Scanner in= new Scanner(System.in);

try{
System.out.println("Enter a number");

a=in.nextInt();
System.out.println(" a="+a);

str="kl university";
a=Integer.parseInt(str);
}
catch(InputMismatchException ime){
System.out.println(ime);
System.out.println("assigning again");
a=12;
}

  catch(NumberFormatException nfe){
  System.out.println(nfe);
  System.out.println("assigning new value");
  a=1;
 }

System.out.println(" a="+a);
}
}
--------------------------------------------------------------------------------------------
THROWS


class ExcThrowsDemo {
void throwOne() throws IllegalAccessException {

System.out.println("inside throwone.");

 throw new IllegalAccessException("demo");
   
}
 public static void main(String args[])
{
 ExcThrowsDemo d1= new ExcThrowsDemo();
try {
 d1.throwOne();
 } catch(IllegalAccessException e) {
 System.out.println(" caught " +e);
  }
 }
}

 
--------------------------------------------------------------------------------------
// An example of nested try statements.
class NestTry {

public static void main(String args[]) {

try {
int a = args.length;
int b = 42 / a;
System.out.println("a = " + a);

  try {  

   if(a==1) a = a/(a-a); // division by zero

   if(a==2) {
   int c[] = { 1 };
   c[42] = 99; // generate an out-of-bounds exception
    }

  } catch(ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index out-of-bounds: " + e);
    }

} catch(ArithmeticException e) {
  System.out.println("Divide by 0: " + e);
    }
  }
}