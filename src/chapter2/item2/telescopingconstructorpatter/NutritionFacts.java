package chapter2.item2.telescopingconstructorpatter;

/**
 * Telescoping constructor pattern elementlerin tek bir constructor içinde setlememk için kademeli olarak element sayısının
 * arttırılarak constructor'ların oluşturulduğu bir uygulamadır.
 *
 * Yeni oluşturulacak obje eklemek istediği elementleri içinde bulunduran en küçük constructor ile objeyi yaratır.
 *
 * Ancak bu yöntem okumaası ve yazması zor olan bir yöntemdir.
 */
public class NutritionFacts {
    private final int servingSize;  // (mL)            required
    private final int servings;  // required
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate; // (g/serving)

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings,
                          int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings,
                          int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings,
                          int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts(int servingSize, int servings,
                          int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}

