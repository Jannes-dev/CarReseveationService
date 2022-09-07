package authentication.menue;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

import authentication.structure.EyeScanStrategy;
import authentication.structure.FingerPrintStrategy;
import authentication.structure.Subject;
import authentication.structure.UserNamePasswordStrategy;

public class AuthenticationMenue {
	
	private int choice;
	private Scanner scanner = new Scanner(System.in);
	
	public Hashtable<String, Subject> authenticationDictonary = new Hashtable<String, Subject>();
	
	public void menu() {
		int weiter = 0;
		Subject subject;
		
		do {
			System.out.println("Was möchten sie tun?\n");
			System.out.println("um eine Authentifizierung hinzuzufügen geben sie eine 1 ein");
			System.out.println("um eine Authentifizierung zu löschen geben sie eine 2 ein");
			System.out.println("um die Authentifizierung angezeigt zu bekommen drücken sie die 3");
			choice = Integer.parseInt(scanner.nextLine());
			
			switch(choice) {
			case 1:
				System.out.println("Geben sie einen nutzernamen ein:");
				String username = scanner.nextLine();
				
				subject = chooseStrategy(username);
				authenticationDictonary.put(username, subject);
				break;
			case 2:
				System.out.println("Um eine Authetifizierung zu löschen geben sie bitte den Nutzernamen ein: ");
				String temporaryUsername = scanner.nextLine();
				if(authenticationDictonary.containsKey(temporaryUsername)) {
					authenticationDictonary.remove(temporaryUsername);
				}
				else
					System.out.println("Dieser Benutzername ist nicht vorhanden!");
					break;
			case 3:
				printAuthenticationDictonary();
				break;
			}
			System.out.println("Wenn sie eine weitere AuthenticationsAktion ausführen wollen geben sie 1 ein, sonst 0:");
			weiter = Integer.parseInt(scanner.nextLine());
		}while(weiter == 1);
	}

	private Subject chooseStrategy(String username) {
		Subject subject = new Subject();
		
		System.out.println("Geben sie für Fingerabdruck-Authentifizierung die 1 ein, für Nutzername-Passwort-Authentifizierung die 2 ein und für Irisscanner-Authentifizierung die 3 ein: ");
		choice = Integer.parseInt(scanner.nextLine());
		
		switch(choice) {
		case 1:
			subject.setStrategy(new FingerPrintStrategy(), username);
			break;
		case 2:
			subject.setStrategy(new UserNamePasswordStrategy(username), username);
			break;
		case 3:
			subject.setStrategy(new EyeScanStrategy(), username);
			break;
		}
		return subject;
	}

	private void printAuthenticationDictonary() {
		if(!authenticationDictonary.isEmpty()) {
			Set<String> keys = authenticationDictonary.keySet();
			for(String key : keys) {
				Subject subject = authenticationDictonary.get(key);
				
				System.out.println("______________________________________________");
				System.out.println("Benutzername = " + key);
				if(subject.getStrategy() instanceof FingerPrintStrategy) {
					System.out.println("Strategy = FingerPrintStrategy");
				}
				if(subject.getStrategy() instanceof UserNamePasswordStrategy) {
					System.out.println("Strategie = UserNamePasswordStrategy");
					UserNamePasswordStrategy temporaryToGetPassword= (UserNamePasswordStrategy) subject.getStrategy();
					System.out.println("Passwort = " + temporaryToGetPassword.getPassword());
				}
				if(subject.getStrategy() instanceof EyeScanStrategy) {
					System.out.println("Strategy = EyeScanStrategy");
				}
			}
		}
		else
			System.out.println("Keine Authentifizierung Vorhanden!");
}
}
