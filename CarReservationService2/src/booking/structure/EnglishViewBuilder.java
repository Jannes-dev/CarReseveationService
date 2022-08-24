package booking.structure;

public class EnglishViewBuilder implements IBuilderBooking {
	
	private Head head;
	private Body body;
	private Footer footer;
	
	public EnglishViewBuilder(Head head, Body body, Footer footer) {
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
