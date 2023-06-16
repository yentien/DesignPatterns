package creation.patterns.builder.example.item;

public class ChickenBurger extends Burger{

  @Override
  public float price() {
    return 30.0f;
  }

  @Override
  public String name() {
    return "Chicken Burger";
  }
}
