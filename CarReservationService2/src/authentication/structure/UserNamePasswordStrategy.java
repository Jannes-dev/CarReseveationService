package authentication.structure;

import java.util.Scanner;

public class UserNamePasswordStrategy implements ICredential {
	private String username = "admin";
	private String password ="admin";
	private int failcount = 0;
	
	public UserNamePasswordStrategy(String username) {
		Scanner scanner = new Scanner(System.in);
		this.username = username;
		System.out.println("Geben Sie ihr gewünschtes Passwort ein:");
		this.password = scanner.nextLine();
	}
	
	@Override
	public boolean authetication() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nutzername:");
		String inputUsername = scanner.nextLine();
		System.out.println("Passwort:");
		String inputPassword = scanner.nextLine();
		//TODO mit namen und password des eines accounts einer Person abgleichen
//		überprüfung ob password and username übereinstimmen
		return username.equals(inputUsername) & password.equals(inputPassword);
	}

	@Override
	public void printConfimation() {
		
		if(authetication()) {
			System.out.println("Login successful");
		}
		else {
			if(failcount < 2) {
				System.out.println("Login not successful. Pls try again!");
				failcount++;
				printConfimation();
			}
			else {
				System.out.println("Login not successful. Reset password!");
			}
		}
	}
	
	public String getPassword() {
		return this.password;
	}

}
