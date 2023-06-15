package base.solid.principles.ocp;

// OCP: open close principle 開閉原則
// 對擴展開放，對修改封閉
// 擴展新的child class時不能去修改原本任何有使用到shape的地方
// 就是把parent class的method抽象化，讓child class去override
public class BaseOCP {

  public void drawShape(Shape shape) {
    shape.draw();
  }
}
