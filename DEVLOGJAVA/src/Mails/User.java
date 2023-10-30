package Mails;

public class User {
	private String nickname;
	private String password;
	private String fullMail;
	private MailAdress mailAdress;
	
	public User(String nicknameInit, String passwordInit)
	{
		this.nickname = nicknameInit;
		this.password = passwordInit;
		this.fullMail = nicknameInit + "@gmail.com";
		this.mailAdress = new MailAdress();
	}
	
	public String GetNickname()
	{
		return nickname;
	}
	
	public void SetNickname(String nickname)
	{
		this.nickname = nickname;
	}
	
	public String GetPassword()
	{
		return password;
	}
	
	public void SetPassword(String password)
	{
		this.password = password;
	}
	
	public String GetFullMail()
	{
		return fullMail;
	}
	
	public void SetFullMail(String fullMail)
	{
		this.fullMail = fullMail;
	}
	
	public MailAdress GetMailAdress()
	{
		return this.mailAdress;
	}
}
