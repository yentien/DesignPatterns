package base.solid.principles.lsp;

public class ParentClass {

  protected int value;

  public void calculate(int count) {
    value += count;
  }

  public int getValue() {
    return value;
  }
}
