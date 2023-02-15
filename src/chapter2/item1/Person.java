package chapter2.item1;

/**
 * Bu obje static factory method örneği için luşturulmuştur.
 *
 * Static factory method factory design pattern ile karıştırılmamalıdır.
 *
 * Static factory method kullanımının en önemli nedeni constructor'lara isim veremeyiz
 * ancak bu methodlar sayesinde constructor'lar için isimlendirme yapılabilmektedir.
 *
 *
 */
public class Person {
    private String name;
    private String surname;
    private int age;

    private Person(){}
    private Person(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    private Person(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static Person createEmptyPerson()
    {
        return new Person();
    }

    public static Person createPersonHasNameAndSurname(String name, String surname)
    {
        return new Person(name, surname);
    }

    public static Person createPersonWithAllInformation(String name, String surname, int age)
    {
        return new Person(name, surname, age);
    }
}
