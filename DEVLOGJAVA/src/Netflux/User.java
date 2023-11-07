package Netflux;

import java.util.Hashtable;

public class User {
	private String name;
	private String password;
	private String mailAdress;
	private int watchTime;
	private Hashtable<TVShow, Integer> serial;
	
	public User(String name, String password, String mailAdress, int watchTime, Content watch)
	{
		this.name = name;
		this.password = password;
		this.mailAdress = mailAdress;
		this.watchTime = watchTime;
	}

	public String GetName()
	{
		return name;
	}

	public void SetName(String name)
	{
		this.name = name;
	}

	public String GetPassword()
	{
		return password;
	}

	public void SetPassword(String password)
	{
		this.password = password;
	}

	public String GetMailAdress()
	{
		return mailAdress;
	}

	public void SetMailAdress(String mailAdress)
	{
		this.mailAdress = mailAdress;
	}

	public int GetWatchTime()
	{
		return watchTime;
	}

	public void SetWatchTime(int watchTime)
	{
		this.watchTime = watchTime;
	}
	
	public void Watch(Content content)
	{
		watchTime += content.GetDuration();
		content.SetViews(content.GetViews() + 1);
	}
}
