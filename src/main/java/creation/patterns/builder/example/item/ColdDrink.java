package creation.patterns.builder.example.item;

public abstract class ColdDrink implements Item {

  @Override
  public Packing packing() {
    return new Bottle();
  }

  public abstract float price();
}
