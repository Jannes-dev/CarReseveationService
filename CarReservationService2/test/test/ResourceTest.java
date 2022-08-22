package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import resource.structure.ChildSeat;
import resource.structure.FamilyVan;
import resource.structure.ICar;
import resource.structure.Limo;
import resource.structure.SetTopBox;

class ResourceTest {
	
	ICar car;
	
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void test() {
		car = new SetTopBox(new Limo());
		car.showDetails();
		System.out.println(car.giveCosts());
		car = new ChildSeat(new FamilyVan());
		car.showDetails();
		System.out.println(car.giveCosts());
		
	}

}
