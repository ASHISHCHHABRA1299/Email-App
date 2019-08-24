package emailApp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String Secondname;
	private String password;
	private String email;
	private String companyname = "aeycompany.com";
	private int mailBoxCap = 500;
	private String AlternativeEmail;
	private String department;
	private int defaultpasswordlength = 8;

	// constructor to declare the name
	public Email(String firstname, String secondname) {

		this.firstname = firstname;
		this.Secondname = secondname;
//		System.out.println("EMAIL CREATED:" + this.firstname + " " + this.Secondname);
		// call the method for the department
		this.department = SetDepartment();
//		System.out.println("DEPARTMENT: " + this.department);
		// call the method returning the random password
		this.password = RandomPassword(defaultpasswordlength);
		System.out.println("PASSWORD: " + this.password);
		email = firstname.toLowerCase() + "." + secondname.toLowerCase() + "@" + this.department + "." + companyname;
//		System.out.println("EMAIL IS: " + email);
	}

	// input Department name
	private String SetDepartment() {
		System.out.print("ENTER DEPARTMENT\n1.SALES\n2.DEVELOPMENT\n3.ACCOUNTING\n0.NONE\nENTER DEPARTMENT CODE:\n");
		Scanner s = new Scanner(System.in);
		int deptc = s.nextInt();
		if (deptc == 1)
			return "sales";
		else if (deptc == 2)
			return "Development";
		else if (deptc == 3)
			return "Accounting";
		else
			return "";
	}

	private String RandomPassword(int length) {
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rndm = (int) (Math.random() * passwordset.length());
			password[i] = passwordset.charAt(rndm);
		}
		return new String(password);
	}

	public void setmailboxcapacity(int capacity) {
		this.mailBoxCap = capacity;
	}

	public void setAlternativeEmail(String email) {
		this.AlternativeEmail = email;
	}

	public void ChangePassword(String pass) {
		this.password = pass;
	}

	public String getPassword() {
		return password;
	}

	public int getMailBoxCap() {
		return mailBoxCap;
	}

	public String getAlternativeEmail() {
		return AlternativeEmail;
	}

	public String ShowInfo() {
		return "Name: " + firstname + " " + Secondname + "\n" + "CompanyEmail: " + email + "\n" + "MailBoxCapacity "
				+ mailBoxCap;
	}
 //https://www.udemy.com/course/practice-java-by-building-projects/learn/lecture/8097782#overview
}
