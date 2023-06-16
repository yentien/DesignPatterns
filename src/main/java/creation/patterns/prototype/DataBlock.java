package creation.patterns.prototype;

public class DataBlock implements IBlock{

  private int value;

  public DataBlock(int value) {
    this.value = value;
  }

  @Override
  public IBlock copy() {
    return new DataBlock(value);
  }

  @Override
  public void print() {
    System.out.println(value);
  }
}
