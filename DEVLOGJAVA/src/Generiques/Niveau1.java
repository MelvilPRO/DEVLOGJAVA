package Generiques;

import java.util.ArrayList;

public class Niveau1 {
	public static <T> T NiveauReturnLast(ArrayList<T> elementsList)
	{
		T value = elementsList.get(elementsList.size() - 1);
		return value;
	}
	
	public static void TestInt()
	{
		ArrayList<Integer> niveauReturnLast = new ArrayList<Integer>();
		niveauReturnLast.add(1);
		niveauReturnLast.add(5);
		niveauReturnLast.add(6);
		
		System.out.println(NiveauReturnLast(niveauReturnLast));
	}
	
	public static void TestString()
	{
		ArrayList<String> niveauReturnLast = new ArrayList<String>();
		niveauReturnLast.add("Bonjour");
		niveauReturnLast.add("Thomas");
		niveauReturnLast.add("Mansion");
		
		System.out.println(NiveauReturnLast(niveauReturnLast));
	}
}
