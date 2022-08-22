package person.structure;

public class NaturalPerson extends Person {
	
	private String gender;
	private String city;
	private String address;
	private int zipCode;
	private int age;
	private String driverLicense;
	private String firstName;
	private String lastName;
	
	public NaturalPerson(String firstName, String lastName, String gender, int age, String driverLicense, String city, String address, int zipCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.driverLicense = driverLicense;
		this.city = city;
		this.address = address;
		this.zipCode = zipCode;
	}
	
	@Override
	public int getBirthday() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setBirthday(int birthday) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}
	
}
