public class Driver
{
    public static void main(String[] args) 
    {
        Vet vet1 = new Vet("Dr Alan Leeder");
        Dog dog = new Dog("Billy");
        Cat cat = new Cat("Steve");

        vet1.vacinate(dog);
        vet1.vacinate(cat);
    
    }
}
