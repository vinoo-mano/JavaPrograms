class Fri{
static int a=5;
static int b=6;
static void Swap()
{
int t;
  System.out.println("before swapping="+a+" "+b);
    t=a;
    a=b;
    b=t;
  System.out.println("after swapping="+a+" "+b);
}
static void Double()
{
 System.out.println("before doubling="+a+" "+b);
  a=2*a;
  b=2*b;
 System.out.println("after doubling="+a+" "+b);
}
static void go()
{
 Swap();
 Double();
}
public static void main(String args[])
{
 go();
}
}