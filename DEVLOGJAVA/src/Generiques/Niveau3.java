package Generiques;

import java.util.ArrayList;

public class Niveau3<T>
{
	private ArrayList<T> container;
	
	public Niveau3(ArrayList<T> container)
	{
		this.container = container;
	}
	
	public void Add(T addedElement)
	{
		container.add(addedElement);
	}
	
	public T Get()
	{
		return container.get(container.size() - 1);
	}
	
	public void Remove()
	{
		container.remove(container.size() - 1);
	}
	
	public T GetAndRemove()
	{
		T value = container.get(container.size() - 1);
		container.remove(container.size() - 1);
		return value;
	}
}
