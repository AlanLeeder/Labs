public class Driver 
{
    public static void main(String[] args) 
    {
        SavingsAccount Acc1 = new SavingsAccount();

        Acc1.setSavingdBalance(2000.0);

        SavingsAccount Acc2 = new SavingsAccount();

        Acc2.setSavingdBalance(3000.0);

        SavingsAccount.modifyInterestRate(0.04f);

        Acc1.calculateMonthlyInterest();
        Acc2.calculateMonthlyInterest();

        System.out.println(Acc1);
        System.out.println(Acc2.toString());

        SavingsAccount.modifyInterestRate(0.05f);

        Acc1.calculateMonthlyInterest();
        Acc2.calculateMonthlyInterest();

        System.out.println(Acc1);
        System.out.println(Acc2.toString());


        



    }
}
    
