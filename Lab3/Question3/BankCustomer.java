public class BankCustomer
{
    private String name;
    private String address;
    private SavingsAccount[] savingAccs = new SavingsAccount[3];
    private int numOfAccs = 0;

    public BankCustomer(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setSavingsAccs(SavingsAccount[] SavingsAccs)
    {
        this.savingAccs = SavingsAccs;
    }

    public SavingsAccount[] geSavingsAccounts()
    {
        return savingAccs;
    }

    public void setNumOfAccs(int numOfAccs)
    {
        this.numOfAccs = numOfAccs;
    }

    public int getNumOfAccs()
    {
        return numOfAccs;
    }

    public void addAccount(SavingsAccount sav)
    {
        if(getNumOfAccs() < 3)
        {
            savingAccs[getNumOfAccs()] = sav;
            numOfAccs ++;
        }

        else
        {
            System.out.println("You have gone over the maximum amount of aloud accounts");
        }
    }

    public double balance(SavingsAccount[] savingAccs)
    {
        
        for(int index = 0; index < numOfAccs; index ++)
        {
            
        }
    }

    
}