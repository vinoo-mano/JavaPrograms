
class Swap{
 int s1,s2;
 }
 
   public static void swapping(s1,s2){
   int temp=s1;
   s1=s2;
   s2=temp;
   System.out.println("after swappinf : "+s1+ " "+s2);
   }
   public static void main(String args[]){
   Swap s1 = new Swap(10);
   Swap s2 = new Swap(20);
   System.out.println("before swappinf : "+s1+ " "+s2);
   swapping(s1,s2);
   }
}
