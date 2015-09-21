package Test;

import Test.Shape;
import Test.ShapeFactory;
import Test.Circle;
import Test.Rectangle;

public class Factory{
	public static void main(String [] args){
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getFactory("CIRCLE");
		shape1.draw();

		Shape shape2 = shapeFactory.getFactory("RECTANGLE");
		shape2.draw();
	}		
}
