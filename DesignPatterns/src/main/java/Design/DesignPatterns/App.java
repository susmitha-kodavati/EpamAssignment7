package Design.DesignPatterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 EagerInitializedSingleton e = new EagerInitializedSingleton() ;
         System.out.println(e.getInstance()) ;
         Computer c = new Computer() ;
         Shape s = c.getShape("Cuboid") ;
         s.draw();
         s.applyColor();
    }
}
