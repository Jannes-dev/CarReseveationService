package resource.structure;

public abstract class Equipment implements ICar{
	protected ICar car;
	
	public Equipment(ICar pICar) {
		car = pICar;
	}
}
