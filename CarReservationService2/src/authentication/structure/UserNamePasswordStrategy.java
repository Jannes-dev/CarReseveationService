package authentication.structure;

import java.util.Scanner;

public class UserNamePasswordStrategy implements ICredential {
	private String username = "admin";
	private String password ="admin";
	private int failcount = 0;
	@Override
	public boolean authetication() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter username:");
		String inputUsername = scanner.nextLine();
		System.out.println("Enter password:");
		String inputPassword = scanner.nextLine();
		
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

}
