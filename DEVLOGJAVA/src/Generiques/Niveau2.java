package Generiques;

import java.util.ArrayList;

public class Niveau2<T>
{
	private ArrayList<T> container;
	
	public Niveau2(ArrayList<T> container)
	{
		this.container = container;
	}
	
	public void Add(T addedElement)
	{
		container.add(addedElement);
	}
	
	public T Get()
	{
		return container.get(0);
	}
	
	public void Remove()
	{
		container.remove(0);
	}
	
	public T GetAndRemove()
	{
		T value = container.get(0);
		container.remove(0);
		return value;
	}
	
	public static void TestInt()
	{
		ArrayList<Integer> listeTest = new ArrayList<Integer>();
		listeTest.add(1);
		listeTest.add(5);
		listeTest.add(6);
		
		Niveau2<Integer> levelTest = new Niveau2<Integer>(listeTest);
		levelTest.Add(9);
		System.out.println(levelTest.Get());
		levelTest.Remove();
		System.out.println(levelTest.Get());
		System.out.println(levelTest.GetAndRemove());
		System.out.println(levelTest.GetAndRemove());
	}
	
	public static void TestString()
	{
		ArrayList<String> listeTest = new ArrayList<String>();
		listeTest.add("Bonjour");
		listeTest.add("Thomas");
		listeTest.add("Mansion");
		
		Niveau2<String> levelTest = new Niveau2<String>(listeTest);
		levelTest.Add("Melvil");
		System.out.println(levelTest.Get());
		levelTest.Remove();
		System.out.println(levelTest.Get());
		System.out.println(levelTest.GetAndRemove());
		System.out.println(levelTest.GetAndRemove());
	}
}
