package Design.Patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    	public static void main( String[] args )
        {
            Shape t = new Triangle() ;
            Shape c = new Circle() ;
            Drawing d = new Drawing() ;
            d.add(t) ;
            d.add(c) ;
            d.draw("red") ;
            d.clear() ;
            d.add(t) ;
            d.add(c) ;
            d.draw("green") ;
            HouseTemplate ht = new Wood() ;
            ht.buildHouse() ;
            ht = new Glass() ;
            ht.buildHouse() ;
        }

    }

