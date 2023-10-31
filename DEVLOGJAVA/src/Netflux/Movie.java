package Netflux;

public class Movie extends Content implements Selectable {
	private String director;
	
	public Movie(String name, Genre genre, int duration, int views, String director) 
	{
		super(name, genre, duration, views);
		this.director = director;
	}

	public String GetDirector()
	{
		return director;
	}

	public void SetDirector(String director)
	{
		this.director = director;
	}
	
	public void Select(User user)
	{
		user.Watch();
	}
}
