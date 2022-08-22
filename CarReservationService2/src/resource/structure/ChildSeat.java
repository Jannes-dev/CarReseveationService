package resource.structure;

public class ChildSeat extends Equipment {

	public ChildSeat(ICar pICar) {
		super(pICar);
	}

	@Override
	public float giveCosts() {
		// TODO Auto-generated method stub
		return car.giveCosts() + 150;
	}

	@Override
	public void showDetails() {
		System.out.println("ChildSeat");
	}

}
