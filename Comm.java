import java.util.Scanner;
class Comm{
int a[]=new int[5];
int b[]=new int[5];
int c=0;
Scanner s = new Scanner(System.in);
void in(){
System.out.println("enter the Array ele");
for(int i=0;i<5;i++)
a[i]=s.nextInt();
System.out.println("enter the Array ele");
for(int i=0;i<5;i++)
b[i]=s.nextInt();
}
void comm() {
for(int i=0;i<5;i++){
 for(int j=0;j<5;j++)
   if(a[i]==b[j]){
      c++;
      System.out.println(a[i]);
      break;
      }
}

if(c==0)
  System.out.println("NO COMMON ELE");
}
public static void main(String args[]){
Comm c = new Comm();
c.in();
c.comm();
}
} 