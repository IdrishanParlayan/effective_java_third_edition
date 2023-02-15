package chapter2.itrm1;

public class Main {
    public static void main(String[] args)
    {
        Person person = Person.createEmptyPerson();
        Person person1 = Person.createPersonHasNameAndSurname("Idrishan", "Parlayan");
        Person person2 = Person.createPersonWithAllInformation("Idrishan", "Parlayan", 20);
    }
}
