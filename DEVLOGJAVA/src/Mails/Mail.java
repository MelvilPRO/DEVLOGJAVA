package Mails;

public class Mail {
	private String content;
	private String mailObject;
	private String receiver;
	private String sender;
	
	public Mail() // We want to keep default constructor
	{
		
	}
	
	public Mail(String contentInit, String mailObjectInit, String receiverInit, String senderInit)
	{
		this.content = contentInit;
		this.mailObject = mailObjectInit;
		this.receiver = receiverInit;
		this.sender = senderInit;
	}
	
	public String GetContent() 
	{
		return content;
	}
	
	public void SetContent(String content)
	{
		this.content = content;
	}
	
	public String GetMailObject()
	{
		return mailObject;
	}
	
	public void SetMailObject(String mailObj)
	{
		this.mailObject = mailObj;
	}
	
	public String GetReceiver()
	{
		return receiver;
	}
	
	public void SetReceiver(String receiver)
	{
		this.receiver = receiver;
	}
	
	public String GetSender()
	{
		return sender;
	}
	
	public void SetSender(String sender)
	{
		this.sender = sender;
	}
	
	public void Display()
	{
		System.out.println("Mail sender: " + this.sender + " - Mail receiver: " + this.receiver);
		System.out.println("Mail object: " + this.mailObject);
		System.out.println("Here is mail content:\n" + this.content);
		
	}
}
