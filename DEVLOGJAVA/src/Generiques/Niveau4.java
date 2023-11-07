package Generiques;

import java.util.Random;
import java.util.ArrayList;

public class Niveau4<T>
{
	private ArrayList<T> container;
	
	public Niveau4(ArrayList<T> container)
	{
		this.container = container;
	}
	
	public void Add(T addedElement)
	{
		container.add(addedElement);
	}
	
	public T Get()
	{
		int nombreAleatoire = RandomNumber(0 ,container.size());
		return container.get(nombreAleatoire);
	}
	
	public void Remove()
	{
		int nombreAleatoire = RandomNumber(0 ,container.size());
		container.remove(nombreAleatoire);
	}
	
	public T GetAndRemove()
	{
		int nombreAleatoire = RandomNumber(0 ,container.size());
		T value = container.get(nombreAleatoire);
		container.remove(nombreAleatoire);
		return value;
	}
	
    public static int RandomNumber(int start, int end) {
        Random random = new Random();
        int nombreAleatoire = random.nextInt(end);
        return nombreAleatoire;
    }
}
