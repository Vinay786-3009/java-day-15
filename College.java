import java.util.*;
public class College{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student name:");
        String name=sc.nextLine();
        System.out.println("Enter student id:");
        int id=sc.nextInt();
        System.out.println("Enter your amount");
        int amount=sc.nextInt();
        feeapplication t=new feeapplication(name,id);
        t.menu();
    }
}
class  feeapplication
{
    String sname;
    int sid;
    int amount;
    int feebalance;
    int paidfee;
    feeapplication(String sname,int sid)
  {
    this.sname=sname;
    this.sid=sid;
    this.amount=amount;
  }
  public void collegefee(int amount)
  {
    if(amount>0)
    {
        paidfee=-amount;
        feebalance=amount-paidfee;
    }
  }
  public void transportationfee(int amount)
  {
    if(amount>0){
        if(amount<=feebalance){
            feebalance-=amount;
            paidfee=amount;
        }
    }
        else{
            System.out.println("your balance is insufficient");
        }
    }
    public void hostelfee(int amount){
        if(amount>0){
            System.out.println("you paid:"+amount);
        }
        else if(amount<0){
            System.out.println("you need to pay:"+amount);
        }
        else{
            System.out.println("you had not paid fee yet:"+amount);
        }
    }
    void menu(){
        System.out.println("Select option:-");
        char option='\0';
        Scanner sc=new Scanner(System.in);
        System.out.println("your name is:"+sname);
        System.out.println("your student id is:"+sid);
        System.out.println("your amount is:"+amount);
        System.out.println("A.collegefee");
        System.out.println("B.transportationfee");
        System.out.println("C.hostelfee");
        System.out.println("D.Balancefee");
        System.out.println("E.Exit");
        do { 
            option=Character.toUpperCase(sc.next().charAt(0));
            switch(option){
                case'A':
                System.out.println("enter amount");
                int amount=sc.nextInt();
                System.out.println("****************MOTHER THERESA *********************");
                 collegefee(amount);
                 System.out.println("amount paid:"+amount);
                 System.out.println("remaining fee:"+feebalance);
                System.out.println("****************THANK YOU *********************");
                break;
                case'B':
                System.out.println("enter amount");
                int amount1=sc.nextInt();
                System.out.println("****************MOTHER THERESA *********************");
                 transportationfee(amount1);
                 System.out.println("amount paid:"+amount1);
                System.out.println("****************THANK YOU *********************");
                break;
                case'C':
                System.out.println("enter amount");
                int amount2=sc.nextInt();
                System.out.println("****************MOTHER THERESA *********************");
                 hostelfee(amount2);
                 System.out.println("amount paid:"+amount2);
                System.out.println("****************THANK YOU *********************");
                break;
                case 'D':
                System.out.println("****************MOTHER THERESA *********************");
                System.out.println("your balance fee is:"+feebalance);
                System.out.println("****************THANK YOU *********************");
                break;
                case'E':
                System.out.println("****************MOTHER THERESA *********************");
                System.out.println("Exiting your application");
                System.out.println("****************THANK YOU *********************");
                break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (option!='E');
    }
  } 
    
