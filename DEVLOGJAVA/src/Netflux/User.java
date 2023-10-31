package Netflux;

public class User {
	private String name;
	private String password;
	private String mailAdress;
	private int watchTime;
	private Content watch;
	
	public User(String name, String password, String mailAdress, int watchTime, Content watch)
	{
		this.name = name;
		this.password = password;
		this.mailAdress = mailAdress;
		this.watchTime = watchTime;
		this.watch = watch;
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

	public Content GetWatch()
	{
		return watch;
	}

	public void SetWatch(Content watch)
	{
		this.watch = watch;
	}
}
