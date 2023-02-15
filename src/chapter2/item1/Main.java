package chapter2.item1;

public class Main {
    public static void main(String[] args)
    {
        Person person = Person.createEmptyPerson();
        Person person1 = Person.createPersonHasNameAndSurname("Idrishan", "Parlayan");
        Person person2 = Person.createPersonWithAllInformation("Idrishan", "Parlayan", 20);
    }
}
