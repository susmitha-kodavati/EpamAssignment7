package Design.Patterns;

public abstract class HouseTemplate {
	public final void buildHouse() {
	buildFoundation() ;
	buildWalls() ;
	buildPillars() ;
	buildWindows() ;
	System.out.println("House is built") ;
	}

	public abstract void buildPillars();

	protected void buildWindows() {
	System.out.println("Windows are kept") ;
	}

	public abstract void buildWalls();

	protected void buildFoundation() {
	System.out.println("foundation laid") ;
	}
}
