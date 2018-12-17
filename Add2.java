import java.util.Scanner;

class Add2 {
public static void main(String args[]){
int x,y,l,m,p,q;

  Sum a1 = new Sum(2,3);
  Sum a2 = new Sum(2.0,3.0);
  Sum a3 = new Sum(22.032424,32.65454);
  System.out.println(a1.Sum(x,y));
  System.out.println(a2.Sum(l,m));
  System.out.println(a3.Sum(p,q));
  
}
}
class Sum{

int sum(int x,int y){
return (x+y);
}
float sum(float l,float m){
return (l+m);
}
double sum(double p,double q){
return (p+q);
}
}