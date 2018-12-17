import java.util.Scanner;
class ArrSum{
int a[]=new int[5];
static int c;
Scanner s = new Scanner(System.in);
void in(){
  System.out.println("enter the Array ele");
  for(int i=0;i<5;i++)
    a[i]=s.nextInt();
}
void sum(){
 for(int i=0;i<5;i++)
  c+=a[i];
  System.out.println("Sum :"+cA);
}
public static void main(String args[]){
  ArrSum s = new ArrSum();
  s.in();
  s.sum();
}
}
