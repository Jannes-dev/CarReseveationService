package person.structure;

public abstract class Person {
	private int age;
	private String name;
	
	public abstract int getBirthday();
	public abstract void setBirthday(int birthday);
	public abstract String getName();
	public abstract void setName(String name);
	public abstract String getAddress();
	
	
}
