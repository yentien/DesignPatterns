package creation.patterns.factory;

import creation.patterns.factory.model.IShape;
import creation.patterns.factory.model.OtherCircle;
import creation.patterns.factory.model.OtherSquare;

public class OtherShapeFactory implements IShapeFactory{

  @Override
  public IShape createShape(String shapeType) {
    if (shapeType.equalsIgnoreCase("otherCircle")) {
      return new OtherCircle();
    } else if (shapeType.equalsIgnoreCase("otherSquare")) {
      return new OtherSquare();
    }
    return null;
  }
}
