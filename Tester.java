package Project;
import java.util.Scanner;
public class Tester {
	    public static void main(String[] args)
	    {
	    Property[] p=new Property[100];
	    int ind=0;
	    int co1=0;
	    Scanner in=new Scanner(System.in);
	    
	    while(true){
	        
	        System.out.println("Welcome to real estate information system");
	    System.out.println("New User or Old one");
	     String stat=in.nextLine();
	     if(stat.equalsIgnoreCase("new one"))
	     {
	        System.out.print("Name:");
	     String name=in.nextLine();
	     System.out.print("User Name:");
	     String user_name=in.nextLine();
	     System.out.print("Password:");
	     String password=in.nextLine();
	     System.out.print("Mobile Number:");
	     long mobno=in.nextLong();
	     in.nextLine();
	     System.out.print("Address:");
	     String add=in.nextLine();
	     p[ind]=new Property(name,user_name,password,mobno,add);
	     ind++;
	     }
	     else if(stat.equalsIgnoreCase("old one"))
	     {
	        int co=0;
	        System.out.print("User Name:");
	     String name=in.nextLine();
	     System.out.print("Password:");
	     String pass=in.nextLine();
	     int a=Property.log_conf(name,pass,p,ind);
	     if(a!=-1)
	     {
	     System.out.println("Post your property\nBuy a property\nSell a property\nRent your Property\nLogout");
	     int cho=in.nextInt();
	     if(cho==1)
	     Property.post(p,a);
	     else if(cho==2||cho==4)
	     Property.buy(p,ind,a);
	     else if(cho==3)
	     Property.sell(p,a);
	     else if(cho==5&&co>0)
	     break; 
	     System.out.println("Your session limit reached just one operation for a login");
	     }
	     else  System.out.println("Your password / user name is wrong\nPlease enter again");
	     }
	    System.out.println("Logged out \n Login\nEnter 1 to continue ");
	    int cont=in.nextInt();
	     in.nextLine();
	         if(cont==0&&co1>0)
	        break;
	    co1++;
	   }
	  }
	 }
