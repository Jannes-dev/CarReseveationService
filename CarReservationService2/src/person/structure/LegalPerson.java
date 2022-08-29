package person.structure;

public class LegalPerson extends Person{
	
	private int idNumber;
	private String l;
	private String city;
	private String address;
	private int zipCode;
	private String companyName;
	
	public LegalPerson(int idNumber, String companyName, String city, String address, int zipCode) {
		this.idNumber = idNumber;
		this.l = "l";
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
	public String getName() {
		return this.companyName;
	}
	
	public String getAddress() {
		return this.address;
	}
	@Override
	public Integer getIdNumber() {
		// TODO Auto-generated method stub
		return this.idNumber;
	}
	@Override
	public String getUnterklasse() {
		// TODO Auto-generated method stub
		return this.l;
	}
	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return this.city;
	}
	@Override
	public int getZipCode() {
		// TODO Auto-generated method stub
		return this.zipCode;
	}

}
