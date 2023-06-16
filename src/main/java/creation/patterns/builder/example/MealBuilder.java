package creation.patterns.builder.example;

import creation.patterns.builder.example.item.ChickenBurger;
import creation.patterns.builder.example.item.Coke;
import creation.patterns.builder.example.item.Pepsi;
import creation.patterns.builder.example.item.VegBurger;

public class MealBuilder {

  public Meal prepareVegMeal() {
    Meal meal = new Meal();
    meal.addItem(new VegBurger());
    meal.addItem(new Coke());
    return meal;
  }

  public Meal prepareNonVegMeal() {
    Meal meal = new Meal();
    meal.addItem(new ChickenBurger());
    meal.addItem(new Pepsi());
    return meal;
  }
}
