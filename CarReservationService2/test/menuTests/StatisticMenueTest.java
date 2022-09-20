package menuTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import statistics.menue.StatisticMenue;

class StatisticMenueTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		StatisticMenue statisticMenue = new StatisticMenue();
		statisticMenue.menu();
	}

}
