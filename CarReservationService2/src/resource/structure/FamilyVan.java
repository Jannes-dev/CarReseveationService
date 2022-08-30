package resource.structure;

public class FamilyVan implements ICar {

	@Override
	public float giveCosts() {
		return 2000;
	}

	@Override
	public String showDetails() {
		return "FamilyVan";
	}

}
