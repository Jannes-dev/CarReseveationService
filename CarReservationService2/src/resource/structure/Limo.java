package resource.structure;

public class Limo implements ICar {

	@Override
	public float giveCosts() {
		// TODO Auto-generated method stub
		return 500000;
	}

	@Override
	public void showDetails() {
		System.out.println("Limusine");
	}

}
