package base.solid.principles.lsp;

// LSP: liskov substitution principle
// 宣告parent class時，其初始化的方式可以是parent class，也可以是child class
// 若初始化child class，且child class有override parent class的方法或屬性
// ，則會使用child class的方法和屬性
public class BaseLSP {

  public static void main(String[] args) {
    ParentClass parentClass = new ChildClass(); // 可被替換child class
    parentClass.calculate(10);
    System.out.println(parentClass.getValue());
  }
}
