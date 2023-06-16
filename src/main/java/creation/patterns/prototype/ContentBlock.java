package creation.patterns.prototype;

public class ContentBlock implements IBlock{

  private String content;

  public ContentBlock(String content) {
    this.content = content;
  }

  @Override
  public IBlock copy() {
    return new ContentBlock(content);
  }

  @Override
  public void print() {
    System.out.println(content);
  }


}
