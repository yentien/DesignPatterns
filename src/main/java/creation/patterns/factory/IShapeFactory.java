package creation.patterns.factory;

import creation.patterns.factory.model.IShape;

public interface IShapeFactory {

  IShape createShape(String shapeType);
}
