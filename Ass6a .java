class Declare
{
    int a=10;
    int b=20;
}
class Arithmetic extends Declare
{
int c=super.a;
int d=super.b;
int add(int c,int d)
{
    int e=c+d;
    return e;
}
}
class Adder extends Arithmetic
{
    int ad=super.add(c, d);
    }
public class Ass6a {
 public static void main(String[] args) {
 Adder add=new Adder();
 int f=add.ad;
 System.out.println("sum ="+f);
    }
    }
 