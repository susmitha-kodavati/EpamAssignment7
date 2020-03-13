package Design.Patterns;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
	private List<Shape> s = new ArrayList<Shape>() ;
	public void draw(String fillColor) {
	// TODO Auto-generated method stub
	for(Shape sh : s) {
	sh.draw(fillColor);
	}
	}
	public void add(Shape sh) {
	this.s.add(sh) ;
	}
	public void remove(Shape sh) {
	s.remove(sh) ;
	}
	public void clear() {
	System.out.println("clear all shapes") ;
	this.s.clear();
	}
}
