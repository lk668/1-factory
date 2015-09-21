package Test;

public class ShapeFactory{
	
	public Shape getFactory(String shapetype){
		if(shapetype == null){
			return null;
		}
		if(shapetype.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}
		else if(shapetype.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		return null;
	}
}
