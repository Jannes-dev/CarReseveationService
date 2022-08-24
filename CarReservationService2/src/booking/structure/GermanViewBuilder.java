package booking.structure;

public class GermanViewBuilder implements IBuilderBooking {
	
	private Head head;
	private Body body;
	private Footer footer;
	
	public GermanViewBuilder(Head head, Body body, Footer footer) {
		this.head = head;
		this.body = body;
		this.footer = footer;
	}
	@Override
	public void printView() {
		head.printHeader();
		body.printBody();
		footer.printFooter();

	}

}
