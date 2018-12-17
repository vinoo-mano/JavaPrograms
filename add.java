import java.util.Scanner;

class Add {
int a,b;
Add(){
a=10;
b=20;
}
int add(int x,int y){
return (x+y);
}
float add(float l,float m){
return (l+m);
}
double add(double x,double y){
return (x+y);
}
int add(){
return (a+b);
}
public static void main(String args[]){
Add a1 = new Add();
int v1 = a1.add();
System.out.println("v1 = " +v1);
Add a2 = new Add();
int x,y;
float l,m;
double p,q;
Scanner s = new Scanner(System.in);
x = s.nextInt();
y = s.nextInt();
System.out.println(a2.add(x,y));
l = s.nextFloat();
m = s.nextFloat();
System.out.println(a2.add(l,m));
p = s.nextDouble();
q = s.nextDouble();
System.out.println(a2.add(p,q));
}
}
