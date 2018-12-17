import java.util.Scanner;

class BubbleSort{
public static void main(String args[]){
Sort s1 = new Sort();
int a[]=new int[5];
float b[]=new float[5];
double c[]=new double[5];
Scanner s = new Scanner(System.in);
System.out.println("enter the n value");
int n = s.nextInt();
System.out.println("enter the array");
for(int i=0;i<n;i++){
a[i] = s.nextInt();
}
System.out.println("enter the array");
for(int i=0;i<n;i++){
b[i] = s.nextFloat();
}
System.out.println("enter the array");
for(int i=0;i<n;i++){
c[i] = s.nextDouble();
}
s1.sort(a,n);
System.out.println("sort array is");
for(int i=0;i<n;i++){
System.out.println(a[i]);
}
s1.sort(b,n);
System.out.println("sort array is");
for(int i=0;i<n;i++){
System.out.println(b[i]);
}
s1.sort(c,n);
System.out.println("sort array is");
for(int i=0;i<n;i++){
System.out.println(c[i]);
}
}
}
class Sort{
int swap,c,d;
int[] sort(int[] a,int n);{
  for (c = 0; c < ( n - 1 ); c++) {
      for (d = 0; d < n - c - 1; d++) {
        if (a[d] > a[d+1])
        {
          swap   = a[d];
          a[d]   = a[d+1];
          a[d+1] = swap;
        }
      }
    }
    return (a);
}
float[] sort(float[] b,int n);{
  for (c = 0; c < ( n - 1 ); c++) {
      for (d = 0; d < n - c - 1; d++) {
        if (b[d] > b[d+1])
        {
          swap   = b[d];
          b[d]   = b[d+1];
          b[d+1] = swap;
        }
      }
    }
    return (b);
    }
double[] sort(double[] c,int n);{
  for (c = 0; c < ( n - 1 ); c++) {
      for (d = 0; d < n - c - 1; d++) {
        if (c[d] > c[d+1])
        {
          swap   = c[d];
          c[d]   = c[d+1];
          c[d+1] = swap;
        }
      }
    }
    return (c);
    }
    }