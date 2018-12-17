import java.util.Scanner;
class BankAccount{
    String name;
    int acNo;
    double balance;
    
    BankAccount(String s, int no, double ob){
        name=s;
        acNo=no;
        balance=ob;
    }
    
    static void deposit(double depAmt){
        balance=balance+depAmt;
        System.out.println("successfully deposited");
        System.out.println(" new balance = Rs."+balance);
    }
    
    static void withdraw(double wthAmt){
        
        balance=balance - wthAmt;
        System.out.println("successfully withdrawn");
        System.out.println(" new balance = Rs."+balance);
    }
}

public static void main(String args[]){

BankAccount ac1=new BankAccount("Akhil",123,10000.00);
ac1.deposit(1000.00);
ac1.withdraw(5000.00);
}
}

