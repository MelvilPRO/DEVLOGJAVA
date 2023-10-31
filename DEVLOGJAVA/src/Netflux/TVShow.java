package Netflux;

import java.util.ArrayList;

public class TVShow {
	private ArrayList<Episode> reserved;
	
	public TVShow(ArrayList<Episode> reserved)
	{
		this.reserved = reserved;
	}

	public ArrayList<Episode> GetReserved()
	{
		return reserved;
	}

	public void SetReserved(ArrayList<Episode> reserved)
	{
		this.reserved = reserved;
	}
}
