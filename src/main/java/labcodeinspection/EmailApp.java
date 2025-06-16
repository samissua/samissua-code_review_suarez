package labcodeinspection;

import java.util.Scanner;
import java.util.logging.Logger;

public class EmailApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Logger log = Logger.getLogger(EmailApp.class.getName());
		
		log.fine("Enter your first name: ");
		String firstName = scanner.nextLine();

		log.fine("Enter your last name: ");
		String lastName = scanner.nextLine();

		log.fine("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");

		int depChoice = scanner.nextInt();
		
		scanner.close();
		Email email = new Email(firstName, lastName);
		email.setDeparment(depChoice);
		email.generateEmail();
		email.showInfo();
	}
}
