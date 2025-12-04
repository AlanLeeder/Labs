public class Vet
{
    private String vetName;

    public Vet(String vetName)
    {
        this.vetName = vetName;
    }

    public void vacinate(Animal a)
    {
        if(a instanceof Dog)
        {
            System.out.println("Dog has been vaccinated " + a);
        }

        else if(a instanceof Cat)
        {
            System.out.println("Cat has been vaccinated " + a);
        }
    }


    @Override
    public String toString()
    {
        return vetName + " is vacinating";
    }
}