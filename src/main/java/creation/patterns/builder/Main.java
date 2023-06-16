package creation.patterns.builder;

public class Main {

  public static void main(String[] args) {
    // 1. do not set all fields
    // 2. too many fields
//    Order order = new Order("item1", "item2", "item3", "item4");

    Order.Builder builder = new Order.Builder();
//    builder.item1("item1");
//    builder.item3("item3");
//    Order order = builder.build();

    // 常見使用方式
    Order order = builder.item1("item1").item3("item3").build();

    System.out.println(order);
  }
}
