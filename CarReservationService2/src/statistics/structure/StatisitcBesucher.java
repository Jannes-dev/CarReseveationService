package statistics.structure;

import booking.structure.EnglishBookingView;
import booking.structure.GermanBookingView;

public abstract class StatisitcBesucher {

	public abstract void besuchen(GermanBookingView germanBookingView);

	public abstract void besuchen(EnglishBookingView englishBookingView);

}
