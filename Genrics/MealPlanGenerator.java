interface MealPlan {
    String getPlanDetails();
}

class VegetarianMeal implements MealPlan {
    public String getPlanDetails() { return "Vegetarian Plan: Salad, Tofu, Beans"; }
}
class VeganMeal implements MealPlan {
    public String getPlanDetails() { return "Vegan Plan: Lentils, Quinoa, Vegetables"; }
}
class KetoMeal implements MealPlan {
    public String getPlanDetails() { return "Keto Plan: Avocado, Eggs, Meat"; }
}
class HighProteinMeal implements MealPlan {
    public String getPlanDetails() { return "High Protein Plan: Chicken breast, Whey protein, Broccoli"; }
}

class Meal<T extends MealPlan> {
    private T mealPlan;
    public Meal(T mealPlan) { this.mealPlan = mealPlan; }
    public T getMealPlan() { return mealPlan; }
}

public class MealPlanGenerator {
    public static <T extends MealPlan> void validateAndGenerateMealPlan(Meal<T> meal) {
        if (meal != null && meal.getMealPlan() != null) {
            System.out.println("Meal Plan Generated Successfully!");
            System.out.println("Details: " + meal.getMealPlan().getPlanDetails());
        } else {
            System.out.println("Invalid Meal Plan.");
        }
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());

        System.out.println("User 1:");
        validateAndGenerateMealPlan(vegMeal);

        System.out.println("\nUser 2:");
        validateAndGenerateMealPlan(ketoMeal);
    }
}
