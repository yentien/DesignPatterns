package creation.patterns.builder.example;

public class BuilderPatternDemo {
  public static void main(String args[]) {
    MealBuilder mealBuilder = new MealBuilder();

    Meal vegMeal = mealBuilder.prepareVegMeal();
    System.out.println("Veg Meal");
    vegMeal.showItems();
    System.out.println("Total cost: " + vegMeal.getCost());

    Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
    System.out.println("Non-Veg Meal");
    vegMeal.showItems();
    System.out.println("Total cost: " + vegMeal.getCost());
  }
}
