package chapter2.item2.builderpattern;

/**
 * Builder pattern, static factory method için fazla sayıda elemente sahip sınıfları yaratmakta
 * efektif bir yöntemdir.
 *
 * Her bir element kendine ait bir methoda sahip olduğu için farklı constructor'lar oluşturmaya gerek kalamaktadır.
 *
 * Immutable objeler oluşturma konusunda da güvenli bir yöntemdir.
 */
public class Main {
    public static void main(String[] args)
    {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240,8)
                .calories(100).sodium(35).carbohydrate(27).build();

        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM).sauceInside().build();
    }
}
