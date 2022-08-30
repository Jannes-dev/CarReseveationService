package resource.structure;

public class SetTopBox extends Equipment{

	public SetTopBox(ICar pICar) {
		super(pICar);
	}
	
	@Override
	public float giveCosts() {
		return car.giveCosts() + 500;
	}

	@Override
	public String showDetails() {
		
		return car.showDetails() + " + SetTopBox";
	}

}
