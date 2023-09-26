package defaultFix;
import java.util.Scanner;

public class Tableaux {
	static Scanner clavier = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Prenoms();
		Moyenne();
		Grilles();
	}
	
	public static void Prenoms()
	{
		String[] prenoms = new String[4];
		prenoms[0] = "Thomas";
		prenoms[1] = "Melvil";
		prenoms[2] = "Sylvio";
		prenoms[3] = "Aicha";
		
		System.out.println("Voici les prenoms enregistrés:");
		for (int indexPrenom = 0; indexPrenom < prenoms.length; indexPrenom++)
		{
			System.out.println(prenoms[indexPrenom]);
		}
	}
	
	public static void Moyenne()
	{
		float[] nombres = { 5, 10, 20, 4, 9 };
		
		float moyenne = 0;
		System.out.println("Voici les nombres enregistrés:");
		for (int indexNombre = 0; indexNombre < nombres.length; indexNombre++)
		{
			System.out.println(nombres[indexNombre]);
			moyenne += nombres[indexNombre];
		}
		moyenne /= nombres.length;
		System.out.println("Voici la moyenne des nombres enregistrés: " + moyenne);
	}
	
	public static void Grilles()
	{
		String[][] grille = CreationGrille();
		/* Setup de la grille et notre position */
		int positionX = 0;
		int positionY = 0;
		
		AfficherGrille(grille);
		
		/* Possibilité de déplacements */
		String deplacement = "";
		boolean premierDeplacement = true;
		do
		{
			/* Création d'une nouvelle grille afin de la réinitialiser */
			grille = CreationGrille();
			deplacement = DemanderDeplacement(premierDeplacement);
			switch (deplacement)
			{
			case "Haut":
				if (positionX > 0)
					positionX -= 1;
				break;
			case "Bas":
				if (positionX < grille.length - 1)
					positionX += 1;
				break;
			case "Gauche":
				if (positionY > 0)
					positionY -= 1;
				break;
			case "Droite":
				if (positionY < grille[0].length - 1)
					positionY += 1;
				break;
			case "Stop":
				break;
			default:
				System.out.println("Déplacement reçu non enregistré: " + deplacement);
			}
			
			/* Applique le caractère de déplacement */
			if (!deplacement.equals("Stop"))
			{
				grille[positionX][positionY] = "@";
				AfficherGrille(grille);
				premierDeplacement = false;
			}
		} while (!deplacement.equals("Stop"));
		
		System.out.println("Fin des déplacements");
	}

	public static String DemanderDeplacement(boolean premierLancement)
	{
		if (premierLancement)
		{
			System.out.println("Veuillez saisir l'un des déplacement suivant:");
			System.out.println("Haut");
			System.out.println("Bas");
			System.out.println("Gauche");
			System.out.println("Droite");
			System.out.println("Stop");
		}
		else
		{
			System.out.println("Inserez un autre déplacement");
		}
		
		String userInput = "";
		do 
		{
			if (userInput != "")
				System.out.println("Le déplacement saisi: " + userInput + " n'est pas enregistré, veuillez réessayer:");
			
			userInput = clavier.next();
		} while (!(userInput.equals("Haut") 
			    || userInput.equals("Bas") 
			    || userInput.equals("Gauche")
			    || userInput.equals("Droite")
			    || userInput.equals("Stop")));
		
		return userInput;
	}
	
	public static String[][] CreationGrille()
	{
		String[][] grille = {{"*", "*", "*", "*"},{"*", "*", "*", "*"},{"*", "*", "*", "*"}};
		return grille;
	}
	
	public static void AfficherGrille(String[][] aGrille)
	{
		for (int indexLigne = 0; indexLigne < aGrille.length; indexLigne++)
		{
			for (int indexChar = 0; indexChar < aGrille[indexLigne].length; indexChar++)
			{
				System.out.print(aGrille[indexLigne][indexChar]);
			}
			
			// Saute à la prochaine ligne
			System.out.println("");
		}
	}
}
