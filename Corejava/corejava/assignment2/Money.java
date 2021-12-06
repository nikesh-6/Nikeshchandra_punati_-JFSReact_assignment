package oops;

class Bank{

    void totalMoneyInBank()
    {
        System.out.println("The Employee incremented salary is :" );

    }
}
class SavingAcoount extends Bank{
    float fixedDeposits =250000;
    void totalMoneyInBank()
    {
        System.out.println("total money in savings account :" +((fixedDeposits)));
    }
}
class CurrentAcccount extends SavingAcoount{
    double cashCredit=50000;
    void totalMoneyInBank()
    {
        System.out.println("The total money in current account "+(cashCredit));


    }
}
public class Money
{
    public static void main(String args[]){

        CurrentAcccount m=new CurrentAcccount();
        SavingAcoount s=new SavingAcoount();


   
        m.totalMoneyInBank();
        s.totalMoneyInBank(); 

        System.out.println("Total money in the bank  is "+( m.fixedDeposits+m.cashCredit)); 

    }
}