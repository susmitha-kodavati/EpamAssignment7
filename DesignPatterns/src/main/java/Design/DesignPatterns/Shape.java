package Design.DesignPatterns;

public abstract class Shape {
	abstract void draw() ;
	protected Color color ;
	public Shape(Color c) {
	this.color = c ;
	}
	abstract public void applyColor() ;
}