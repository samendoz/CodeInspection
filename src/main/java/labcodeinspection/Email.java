package labcodeinspection;

import java.util.Locale;

/**
 * 
 * @author smend
 */
public class Email {
	/**
	 * 
	 * @String m_firstname
	 */
	private final transient String m_firstName;
	/**
	 * 
	 * @String m_firstname
	 */
	private final transient String m_lastName;
	/**
	 * 
	 * @String password
	 */
	private transient String password;
	/**
	 * 
	 * @String department
	 */
	private transient String department;
	/**
	 * 
	 * @Integer defaultpasswordLength
	 */
	private final transient int defaultpasswordLength = 8;
	/**
	 * 
	 * @String email
	 */
	private transient String email;
	/**
	 * 
	 * @param firstname
	 * @param lastname
	 */
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}

	/**
	 * 
	 *
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	
	/**
	 * 
	 * @param depChoice
	 */
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
		default:
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	/**
	 * 
	 *
	 */
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName.toLowerCase(Locale.ROOT) + this.m_lastName.toLowerCase(Locale.ROOT) + "@" + this.department
				+ ".espol.edu.ec";
	}
}
