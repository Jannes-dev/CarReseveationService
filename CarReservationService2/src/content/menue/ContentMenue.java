package content.menue;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;

import booking.menue.BookingMenue;
import booking.structure.GermanBookingView;
import content.structure.File;
import content.structure.Folder;
import content.structure.Knot;
import payment.menue.PaymentMenue;

public class ContentMenue {

	private static final ContentMenue contentMenue = new ContentMenue();
	private SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy", Locale.ENGLISH);
	private SimpleDateFormat formatterMonth = new SimpleDateFormat("MM", Locale.ENGLISH);
	private BookingMenue bookingMenue = BookingMenue.getInstance();

	private ContentMenue() {

	}

	public static ContentMenue getInstance() {
		// TODO Auto-generated method stub
		return contentMenue;
	}

	public void menu() {
		createAutomaticFileHierarchie();

	}

	private void createAutomaticFileHierarchie() {

		Folder root = new Folder("root");
		Folder folderYear;
		Folder folderMonth;

		if (!bookingMenue.germanBookingDictonary.isEmpty()) {
			Set<Integer> keys = bookingMenue.germanBookingDictonary.keySet();
			for (Integer key : keys) {

				String year = formatterYear.format(bookingMenue.germanBookingDictonary.get(key).getBookingDate());
				folderYear = new Folder(year);

				String month = formatterMonth.format(bookingMenue.germanBookingDictonary.get(key).getBookingDate());
				folderMonth = new Folder(month);

				// Check ob ornder mit jahr schon existiert
				if (getFolderWithNameIfExists(year, root) != null) {
					folderYear = (Folder) getFolderWithNameIfExists(year, root);
//					checken ob ordner mit monat schon existiert
					if (getFolderWithNameIfExists(month, folderYear) != null) {
						File newFile = createNewGermanFile(key);
						folderMonth = (Folder) getFolderWithNameIfExists(month, folderYear);
						folderMonth.add(newFile);
//						getFolderWithNameIfExists(year, root).add(folderMonth);
					} else {
						File newFile = createNewGermanFile(key);
						folderMonth.add(newFile);
						getFolderWithNameIfExists(year, root).add(folderMonth);
					}
				} else {
					File newFile = createNewGermanFile(key);
					folderMonth.add(newFile);
					folderYear.add(folderMonth);
					root.add(folderYear);

				}

			}
		} else {
			System.out.println("Keine Deutschen Buchungsaufträge");
		}
		if (!bookingMenue.englishBookingDictonary.isEmpty()) {
			Set<Integer> keys = bookingMenue.englishBookingDictonary.keySet();
			for (Integer key : keys) {

				String year = formatterYear.format(bookingMenue.englishBookingDictonary.get(key).getBookingDate());
				folderYear = new Folder(year);

				String month = formatterMonth.format(bookingMenue.englishBookingDictonary.get(key).getBookingDate());
				folderMonth = new Folder(month);

				// Check ob ornder mit jahr schon existiert
				if (getFolderWithNameIfExists(year, root) != null) {
					folderYear = (Folder) getFolderWithNameIfExists(year, root);
//					checken ob ordner mit monat schon existiert
					if (getFolderWithNameIfExists(month, folderYear) != null) {
						File newFile = createNewEnglishFile(key);
						folderMonth = (Folder) getFolderWithNameIfExists(month, folderYear);
						folderMonth.add(newFile);
//						getFolderWithNameIfExists(year, root).add(folderMonth);
					} else {
						File newFile = createNewEnglishFile(key);
						folderMonth.add(newFile);
						getFolderWithNameIfExists(year, root).add(folderMonth);
					}
				} else {
					File newFile = createNewEnglishFile(key);
					folderMonth.add(newFile);
					folderYear.add(folderMonth);
					root.add(folderYear);

				}
			}
		} else {
			System.out.println("no BookingFiles");
		}

		root.operation();
	}
	
	private File createNewGermanFile(Integer key) {
		File newFile = new File("BookingID " + bookingMenue.germanBookingDictonary.get(key).getBookingId(),
				bookingMenue.germanBookingDictonary.get(key));
		return newFile;
	}
	
	private File createNewEnglishFile(Integer key) {
		File newFile = new File("BookingID " + bookingMenue.englishBookingDictonary.get(key).getBookingId(),
				bookingMenue.englishBookingDictonary.get(key));
		return newFile;
	}

	public Knot getFolderWithNameIfExists(String nameToSearchFor, Folder knot) {
		Knot exists = null;
		for (Knot folder : knot.childElement) {
			String compareName = folder.gibName();
			if (nameToSearchFor.equals(compareName)) {
				exists = folder;
				break;
			}
		}

		return exists;
	}

}
