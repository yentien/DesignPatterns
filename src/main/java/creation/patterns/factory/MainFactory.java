package creation.patterns.factory;

import creation.patterns.factory.model.IShape;

// Factory 工廠模式
// 交由shapeFactory class專門實例化對象
public class MainFactory {
  public static void main(String[] args) {
    IShapeFactory shapeFactory = new ShapeFactory();
    IShape circle = shapeFactory.createShape("circle");
    System.out.println(circle.getShapeName());

    IShape square = shapeFactory.createShape("square");
    System.out.println(square.getShapeName());

    IShapeFactory shapeFactory1 = new OtherShapeFactory();
    IShape otherCircle = shapeFactory1.createShape("otherCircle");
    System.out.println(otherCircle.getShapeName());

    IShape otherSquare = shapeFactory1.createShape("otherSquare");
    System.out.println(otherSquare.getShapeName());

//    Circle circle = new Circle();
//    System.out.println(circle.getShapeName());
//
//    Square square = new Square();
//    System.out.println(square.getShapeName());
  }
}
