public class SavingsAccount 
{
    private int accNo;
    private static int nextAccNo = 0;
    private static float annualInterestRate = 0;
    private double savingsBalance;

    public SavingsAccount()
    {
        ++nextAccNo;
        setAccNo(nextAccNo);
    }

    public int getAccNo()
    {
        return accNo;
    }

    public void setAccNo(int accNo)
    {
        this.accNo = accNo;
    }

    public static float getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public static void modifyInterestRate(float annualInterestRate)
    {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance()
    {
        return savingsBalance;
    }

    public void setSavingdBalance(double savingsBalance)
    {
        this. savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest()
    {
        savingsBalance = savingsBalance + (getSavingsBalance() * annualInterestRate /12);
    }

    public String toString()
    {
        return "SavingsAccount [accNo" + accNo + ", savingsBalance" + savingsBalance + "j";
    }
        



}
