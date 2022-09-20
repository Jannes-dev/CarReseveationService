package person.structure;

public class NaturalPerson extends Person {
	
	private static int idNumber;
	private int acutalIdNumber;
	private String n;
	private String gender;
	private String city;
	private String address;
	private int zipCode;
	private int age;
	private String driverLicense;
	private String firstName;
	private String lastName;
	
	public NaturalPerson(String firstName, String lastName, String gender, int age, String driverLicense, String city, String address, int zipCode) {
		idNumber = idNumber * 2;
		this.acutalIdNumber = idNumber;
		this.n = "n";
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
		return this.age;
	}


	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.firstName + " " + this.lastName;
	}


	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return this.address;
	}

	@Override
	public Integer getIdNumber() {
		// TODO Auto-generated method stub
		return this.acutalIdNumber;
	}

	@Override
	public String getUnterklasse() {
		// TODO Auto-generated method stub
		return this.n;
	}

	public String getGender() {
		// TODO Auto-generated method stub
		return this.gender;
	}
	
	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return this.city;
	}

	public int getZipCode() {
		// TODO Auto-generated method stub
		return this.zipCode;
	}

	public String getDriverLicense() {
		// TODO Auto-generated method stub
		return this.driverLicense;
	}
	
}
