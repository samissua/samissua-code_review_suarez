package labcodeinspection;

import java.util.Locale;

public class Email {

	private String firstName;
	private String lastName;
	private String password = "";
	private String department;
	private final int passwordLength = 8;
	private String userEmail;

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	final public void showInfo() {
		System.out.println("\nFIRST NAME= " + firstName + "\nLAST NAME= " + lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + userEmail + "\nPASSWORD= " + password);
	}

	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		}
	}

	private String randomPassword(int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	public void generateEmail() {
		this.password = this.randomPassword(this.passwordLength);
		this.userEmail = this.firstName.toLowerCase(Locale.ENGLISH) + this.lastName.toLowerCase(Locale.ENGLISH) + "@" + this.department
				+ ".espol.edu.ec";
	}
	
}
