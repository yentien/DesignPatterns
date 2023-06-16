package creation.patterns.builder;

// Builder
public class Order {

  // 靜態嵌套類
  public static class Builder {
    private String item1;
    private String item2;
    private String item3;
    private String item4;

    public Builder() {
    }

    public Builder item1(String item1) {
      this.item1 = item1;
      return this;
    }

    public Builder item2(String item2) {
      this.item2 = item2;
      return this;
    }

    public Builder item3(String item3) {
      this.item3 = item3;
      return this;
    }

    public Builder item4(String item4) {
      this.item4 = item4;
      return this;
    }

    public Order build() {
      return new Order(this);
    }
  }

  private String item1;
  private String item2;
  private String item3;
  private String item4;

  private Order(Builder builder) {
    this.item1 = builder.item1;
    this.item2 = builder.item2;
    this.item3 = builder.item3;
    this.item4 = builder.item4;
  }

  public String getItem1() {
    return item1;
  }

  public void setItem1(String item1) {
    this.item1 = item1;
  }

  public String getItem2() {
    return item2;
  }

  public void setItem2(String item2) {
    this.item2 = item2;
  }

  public String getItem3() {
    return item3;
  }

  public void setItem3(String item3) {
    this.item3 = item3;
  }

  public String getItem4() {
    return item4;
  }

  public void setItem4(String item4) {
    this.item4 = item4;
  }

  @Override
  public String toString() {
    return "Order{" +
        "item1='" + item1 + '\'' +
        ", item2='" + item2 + '\'' +
        ", item3='" + item3 + '\'' +
        ", item4='" + item4 + '\'' +
        '}';
  }
}
