package Netflux;

import java.util.ArrayList;

public class TVShow implements Selectable{
	private String name;
	private ArrayList<Episode> reserved;
	
	public TVShow(String name, ArrayList<Episode> reserved)
	{
		this.name = name;
		this.reserved = reserved;
	}

	public String GetName()
	{
		return name;
	}

	public void SetName(String name)
	{
		this.name = name;
	}

	public ArrayList<Episode> GetReserved()
	{
		return reserved;
	}

	public void SetReserved(ArrayList<Episode> reserved)
	{
		this.reserved = reserved;
	}
	
	public void Select(User user)
	{
		
	}
}
