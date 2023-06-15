package base.solid.principles.lsp;

public class ChildClass extends ParentClass {

  @Override
  public void calculate(int count) {
    value += count + 100;
  }

  @Override
  public int getValue() {
    return value + 1000;
  }
}
