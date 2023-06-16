package creation.patterns.prototype;

public class MainProtoType {

  public static void main(String[] args) {
    IBlock iContentBlock = new ContentBlock("content");
    IBlock iDataBlock = new DataBlock(10);

    iContentBlock.copy().print();
    iDataBlock.copy().print();
  }
}
