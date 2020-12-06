package projects;

import java.util.Scanner;

class Email
{
	String firstName;
	String lastName;
	String password;
	String email;
	int mailboxCapacity=500;
	int defaultPassword=8;
	String department;
	String alternateEmail;
	String companyName="apcompany.com";
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("New Worker:"+this.firstName+" "+this.lastName);
		department=setDepartment();
		System.out.println("department:"+department);
		
		password=randomPassword(defaultPassword);
		System.out.println("Your password:"+password);
		
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companyName;
		System.out.println(email);
	}
	
	public String setDepartment()
	{
		System.out.println("Department list:\n1.for Sale\n2.for Devlopment\n3.for Accounting\n0.for noon");
		System.out.println("Enter department code");
		Scanner obj2=new Scanner(System.in);
		int n=obj2.nextInt();
		if(n==1)return "Sale";
		else if(n==2)return "Devlopment";
		else if(n==3)return "Accounting";
		else return "";
	}
	public String randomPassword(int lenght)
	{
		String passwordSet="abcdefghijklmnopqrstwxyz1234567890@#$%&";
		char [] password=new char[lenght];
		for(int i=0;i<lenght;i++)
		{
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	public void setMailboxCapacity(int mailboxCapacity)
	{this.mailboxCapacity=mailboxCapacity;}
	public void setAlternateEmail(String email)
	{this.email=email;}
	public void setPassword(String password)
	{this.password=password;}
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}

	public void show()
	{
		System.out.println("Empolyee Name:"+firstName+" "+lastName);
		System.out.println("Email:"+email);
		System.out.println("mailboxCapacity:"+mailboxCapacity+"mb");
	}
	
		
	
}


public class EmailApp {

	public static void main(String[] args) {
		Email obj = new Email("Akash","Panari");
		obj.show();
		
		
	}

}
