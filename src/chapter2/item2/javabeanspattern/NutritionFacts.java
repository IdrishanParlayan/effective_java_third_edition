package chapter2.item2.javabeanspattern;

/**
 * Java Beans Pattern boş bir constructor oluşturur ve her bir field için setter fonksiyonu oluşturur.
 *
 * Bu sayede boş bir obje oluşturulur ve sadece gerkli olan elementleri set edilebilir.
 *
 * Ancak bu durum obje oluşturulurken tutarsız durumlarla karışılaşılmasına sebep olabilir
 *
 * Ayrıca bu patern sınıflarda immutable olma ihtimalini ortadan kaldırmaktadır.
 */
public class NutritionFacts {

    private int servingSize = -1; // required
    private int servings = -1; // required
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFacts() { }

    // Setters
    public void setServingSize(int val)
    { servingSize = val; }
    public void setServings(int val)
    { servings = val; }
    public void setCalories(int val)
    { calories = val; }
    public void setFat(int val)
    {fat=val;}
    public void setSodium(int val)
    { sodium = val; }
    public void setCarbohydrate(int val)
    { carbohydrate = val; }




}
