package Mails;

import java.util.ArrayList;

public class MailAdress {
	private ArrayList<Mail> sentMails;
	private ArrayList<Mail> recvMails;
	
	public MailAdress()
	{
		sentMails = new ArrayList<Mail>();
		recvMails = new ArrayList<Mail>();
	}
	
	public MailAdress(ArrayList<Mail> sentMailsInit,ArrayList<Mail> recvMailsInit)
	{
		sentMails = sentMailsInit;
		recvMails = recvMailsInit;
	}
	
	/* Getters */
	public ArrayList<Mail> GetSentMails()
	{
		return sentMails;
	}
	
	public ArrayList<Mail> GetRecvMails()
	{
		return recvMails;
	}
	
	/* Setters */
	public void SetSentMails(ArrayList<Mail> sentMails)
	{
		this.sentMails = sentMails;
	}

	public void SetRecvMails(ArrayList<Mail> recvMails)
	{
		this.recvMails = recvMails;
	}
	
	/* Add mail instance to list */
	public void AddSentMail(Mail sentMail)
	{
		this.sentMails.add(sentMail);
	}
	
	public void AddRecvMail(Mail recvMail)
	{
		this.recvMails.add(recvMail);
	}
	
	/* Add mails instances to list */
	public void AddSentMails(ArrayList<Mail> sentMails)
	{
		for (int mailIndex = 0; mailIndex < sentMails.size(); mailIndex++)
		{
			AddSentMail(sentMails.get(mailIndex));
		}
	}
	
	public void AddRecvMails(ArrayList<Mail> recvMails)
	{
		for (int mailIndex = 0; mailIndex < recvMails.size(); mailIndex++)
		{
			AddRecvMail(recvMails.get(mailIndex));
		}
	}
	
	/* Display mail instance at index */
	public void DisplaySentMail(int mailIndex)
	{
		if (mailIndex >= this.sentMails.size())
		{
			System.out.println("MailAdress::DisplaySentMail mailIndex has invalid mail id!");
			return;
		}
		
		Mail currentMail = this.sentMails.get(mailIndex);
		currentMail.Display();
	}
	
	public void DisplayRecvMail(int mailIndex)
	{
		if (mailIndex >= this.recvMails.size())
		{
			System.out.println("MailAdress::DisplayRecvMail mailIndex has invalid mail id!");
			return;
		}
		
		Mail currentMail = this.recvMails.get(mailIndex);
		currentMail.Display();
	}
	
	/* Display all mails instances */
	public void DisplaySentMails()
	{
		for (int mailIndex = 0; mailIndex < this.sentMails.size(); mailIndex++)
		{
			Mail currentMail = this.sentMails.get(mailIndex);
			currentMail.Display();
		}
	}
	
	public void DisplayRecvMails()
	{
		for (int mailIndex = 0; mailIndex < this.recvMails.size(); mailIndex++)
		{
			Mail currentMail = this.recvMails.get(mailIndex);
			currentMail.Display();
		}
	}
	
	public void DisplayAllMails()
	{
		DisplaySentMails();
		System.out.println("******************");
		DisplayRecvMails();
		System.out.println("******************");
	}
}
