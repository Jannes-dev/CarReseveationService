package content.structure;

import java.util.ArrayList;

public abstract class Knot {
	private String name = "";
	static int ebene = 0;
	ArrayList<Knot> childElement = new ArrayList<Knot>();
	
	public Knot(String name) {
		this.name = name;
	}
	
	public abstract void operation();
	
	public void add(Knot folder) {
		System.out.println("Child method not implementet");
	}
	
	public void remove(Knot folder) {
		System.out.println("Child method not implementet");
	}
	
	public void gibKind() {
		System.out.println("Child method not implementet");
	}
	
	public String gibName() {
		return this.name;
	}
}
