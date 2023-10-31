package Netflux;

public abstract class Content {
	private String name;
	private Genre genre;
	private int duration;
	private int views;
	
	public Content(String name, Genre genre, int duration, int views)
	{
		this.name = name;
		this.genre = genre;
		this.duration = duration;
		this.views = views;
	}

	public String GetName()
	{
		return name;
	}

	public void SetName(String name)
	{
		this.name = name;
	}

	public Genre GetGenre()
	{
		return genre;
	}

	public void SetGenre(Genre genre)
	{
		this.genre = genre;
	}

	public int GetDuration()
	{
		return duration;
	}

	public void SetDuration(int duration)
	{
		this.duration = duration;
	}

	public int GetViews()
	{
		return views;
	}

	public void SetViews(int views)
	{
		this.views = views;
	}
}
