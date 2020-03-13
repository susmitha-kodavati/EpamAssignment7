package Design.DesignPatterns;

public class Cuboid extends Shape {
	public Cuboid(Color c) {
	// TODO Auto-generated constructor stub
	super(c) ;
	}
	@Override
	public void draw() {
	// TODO Auto-generated method stub
	System.out.println("Computer CPU is in Cuboid shape") ;
	}
	@Override
	public void applyColor() {
	// TODO Auto-generated method stub
	System.out.println("Cuboid filled with black") ;
	//color.applyColor() ;
	Black b = new Black() ;
	b.applyColor();
	}

}