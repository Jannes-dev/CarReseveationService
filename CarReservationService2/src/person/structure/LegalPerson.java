package person.structure;

public class LegalPerson extends Person{

	private String city;
	private String address;
	private int zipCode;
	private String companyName;
	
	public LegalPerson(String companyName, String city, String address, int zipCode) {
		this.city = city;
		this.address = address;
		this.zipCode = zipCode;
		this.companyName = companyName;
		
		
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
		return companyName;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	
	public String getAddress() {
		return address;
	}

}
