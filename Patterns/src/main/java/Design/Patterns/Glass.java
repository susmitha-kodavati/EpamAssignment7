package Design.Patterns;

public class Glass extends HouseTemplate{
	@Override
	public void buildPillars() {
		System.out.println("Pillars laid");
	}
	@Override
	public void buildWalls() {
		System.out.println("Walls are constructed");
	}

}
