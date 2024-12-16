import java.util.*;
class data
{
    public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter customer name:");
String name=sc.nextLine();
Atm r= new Atm();
System.out.println("Enter your pin:");
int enteredPin = sc.nextInt(); 
r.display();
}
}
class Atm{
    int balance=1000;
    public void checkbalance()
    {
        System.out.println("your current balance is:"+balance);
    }
    public void withdrawmoney(int amount)
    {
        System.out.println("enter amount to withdraw:");
        
        if(amount>balance)
        {
            System.out.println("insufficient balance:");

        }else{
            balance-=amount;
            System.out.println("you have withdraw:"+amount);
        }
    }
    public void depositmoney(int amount)
    {
        System.out.println("enter amount to deposit");
       if(amount>0)
       {
        balance+=amount;
        System.out.println("you have deposited:"+amount);
       }
    }
    public void display()
    {
        System.out.println(" choose option:");
        Scanner sc = new Scanner(System.in); 
        int choice;
        do
        {
        System.out.println("1. Check Balance"); 
        System.out.println("2. Withdraw Money"); 
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:"); 
        choice = sc.nextInt(); 
        switch (choice)
        {
            case 1:
                checkbalance();
                System.out.println("***********************************");
                break;
            case 2: 
                System.out.println("Enter amount to withdraw:");
                int withdrawAmount = sc.nextInt();
                withdrawmoney(withdrawAmount); 
                System.out.println("*******************************");
                break;
            case 3:
                System.out.println("Enter amount to deposit:"); 
                int depositAmount = sc.nextInt();
                depositmoney(depositAmount);
                System.out.println("****************************");
                break; 
            case 4:
                System.out.println("Thank you for using the ATM."); 
                System.out.println("****************************");
                break;
            default: 
                System.out.println("Invalid choice. Please try again."); 
                break;
        }
    }while(choice!=4);

    }
}


