package Exercices;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		TPA();
		TPB();
		TPC();
		TPBONUS();
	}

	public static void TPA() 
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Entrez votre nom de famille:");
		String familyName = console.next();
		System.out.println("Entrez votre prenom:");
		String firstName = console.next();
		
		if (familyName.length() == 0 || firstName.length() == 0)
		{
			System.out.println("La case du nom ou du prénom ne peut être vide!");
			console.close();
			return;
		}
		
		String personMail = familyName.charAt(0) + firstName + "@acme.fr";
		System.out.println("Voici l'adresse mail générée à partir de votre nom et prénom: " + personMail);
		
		console.close();
	}
	
	public static void TPB() 
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Entrez votre nombre d'attaque:");
		int attaque = console.nextInt();
		System.out.println("Entrez votre nombre d'armure:");
		int armure = console.nextInt();
		System.out.println("Voici les résultats des dégats: " + DegatsAttaqueArmure(attaque, armure));
		
		console.close();
	}
	
	public static int DegatsAttaqueArmure(int aAttaque, int aArmure)
	{
		/* L'équivalent de l'opération ternaire:
		if (aArmure > aAttaque)
			return 1;
		return aAttaque - aArmure;
		*/
		return (aArmure > aAttaque) ? 1 : (aAttaque - aArmure);
	}
	
	public static void TPC() 
	{
		/* Création d'un registre pour chaque lettre ainsi que leur valeurs
		 * Comme cela on pourra parcourir chaque lettre et déduire les valeurs correspondantes
		 * Puis tout additionner pour avoir le résultat de l'opération.
		 */
		Hashtable<String, Integer> registry = new Hashtable<String, Integer>();
		registry.put("a", 1);
		registry.put("e", 1);
		registry.put("i", 1);
		registry.put("n", 1);
		registry.put("o", 1);
		registry.put("r", 1);
		registry.put("s", 1);
		registry.put("t", 1);
		registry.put("u", 1);
		registry.put("l", 1);
		
		registry.put("d", 2);
		registry.put("g", 2);
		registry.put("m", 2);
		
		registry.put("b", 3);
		registry.put("c", 3);
		registry.put("p", 3);
		
		registry.put("f", 4);
		registry.put("h", 4);
		registry.put("v", 4);
		
		registry.put("j", 8);
		registry.put("q", 8);
		
		registry.put("k", 10);
		registry.put("w", 10);
		registry.put("x", 10);
		registry.put("y", 10);
		registry.put("z", 10);
		
		Scanner console = new Scanner(System.in);
		System.out.println("Entrez un mot pour le Scrabble:");
		String scrabbleWord = console.next();
		
		/* Evite à rajouter les correspondances en majuscules */
		scrabbleWord = scrabbleWord.toLowerCase();
		
		int scrabbleValue = 0;
		for (int charIndex = 0; charIndex < scrabbleWord.length(); charIndex++)
		{
			String current = String.valueOf(scrabbleWord.charAt(charIndex));
			scrabbleValue += registry.get(current); 
		}
		
		System.out.println("Voici la valeur du mot pour le scrabble: " + scrabbleValue);
		console.close();
	}
	
	public static void TPBONUS() 
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Entrez la valeur de a:");
		int aValue = console.nextInt();
		System.out.println("Entrez la valeur de b:");
		int bValue = console.nextInt();
		
		System.out.println("Voici la valeur bonus: " + TPBONUSIMPL(aValue, bValue));
		console.close();
	}
	
	public static int TPBONUSIMPL(int a, int b)
	{
		return a % b;
	}
}
