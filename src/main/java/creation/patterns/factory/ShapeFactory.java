package creation.patterns.factory;

import creation.patterns.factory.model.Circle;
import creation.patterns.factory.model.IShape;
import creation.patterns.factory.model.Square;

public class ShapeFactory implements IShapeFactory{

  @Override
  public IShape createShape(String shapeType) {
    if (shapeType.equalsIgnoreCase("circle")) {
      return new Circle();
    } else if (shapeType.equalsIgnoreCase("square")) {
      return new Square();
    }
    return null;
  }

  //  public Circle createCircle() {
//    return new Circle();
//  }
//
//  public Square createSquare() {
//    return new Square();
//  }
}
