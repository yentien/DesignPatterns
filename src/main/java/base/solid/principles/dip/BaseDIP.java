package base.solid.principles.dip;

// DIP: dependency inversion principle 依賴反轉原則
// 將依賴具體的class改成抽象的interface，再由其他地方去實例化抽象介面
public class BaseDIP {

  private IClass iClass;

  public BaseDIP(IClass iClass) {
    this.iClass = iClass;
  }

  public void test() {
    System.out.println(iClass.getSomething());
  }
}