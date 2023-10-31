package Books;

import java.util.ArrayList;

public class User 
{
	private String firstName;
	private String lastName;
	private String mailAdress;
	private ArrayList<Book> holdBooks;
	
	User(String firstNameInit, String lastNameInit, String mailAdressInit, ArrayList<Book> holdBooksInit)
	{
		this.firstName = firstNameInit;
		this.lastName = lastNameInit;
		this.mailAdress = mailAdressInit;
		this.holdBooks = holdBooksInit;
	}
	
	public String GetFirstName()
	{
		return firstName;
	}
	
	public void SetFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String GetLastName()
	{
		return lastName;
	}
	
	public void SetLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String GetMailAdress()
	{
		return mailAdress;
	}
	
	public void SetMailAdress(String mailAdress)
	{
		this.mailAdress = mailAdress;
	}
	
	public ArrayList<Book> GetHoldBooks()
	{
		return holdBooks;
	}
	
	public void SetHoldBooks(ArrayList<Book> holdBooks)
	{
		this.holdBooks = holdBooks;
	}
}
