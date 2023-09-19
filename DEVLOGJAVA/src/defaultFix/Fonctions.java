package defaultFix;

import java.util.Scanner;

public class Fonctions {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		// Niveau 1
		System.out.println("Veuillez entrer la longueur du rectange");
		int longueur = clavier.nextInt();
		System.out.println("Veuillez entrer la largeur du rectangle");
		int largeur = clavier.nextInt();
		
		int resultAire = AireDuRectangle(longueur, largeur);
		System.out.println("L'aire du rectange fait: " + resultAire);
		
		// Niveau 2
		System.out.println("Veuillez entrer  la chaine de caractères a répéter");
		String aRepeter = clavier.next();
		System.out.println("Veuillez entrer le nombre de répétitions");
		int nombreDeRepetitions = clavier.nextInt();
		EcrirePlusieursFois(aRepeter, nombreDeRepetitions);
		
		// Niveau 3
		System.out.println("Veuillez entrer le nombre pour la puissance");
		int nombrePuissance = clavier.nextInt();
		System.out.println("Veuillez indiquer la puissance du nombre");
		int nombreExposant = clavier.nextInt();
		int puissance = Puissance(nombrePuissance, nombreExposant);
		System.out.println("Voici le résultat de la fonction puissance " + puissance);
		
		clavier.close();
	}
	
	// Niveau 1
	public static int AireDuRectangle(int longueur, int largeur)
	{
		return longueur * largeur;
	}
	
	// Niveau 2
	public static void EcrirePlusieursFois(String chaine, int nombreDeFois)
	{
		for (int i = 0; i < nombreDeFois; i++)
		{
			System.out.println(chaine);
		}
	}
	
	// Niveau 3
	public static int Puissance(int valeur, int puissance)
	{
		int result = valeur;
		
		for (int i = 1; i < puissance; i++)
		{
			result *= valeur;
		}
		
		return result;
	}
}
