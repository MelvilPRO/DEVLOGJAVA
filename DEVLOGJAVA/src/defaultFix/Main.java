package defaultFix;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TP3();
	}
	
	public static void TP1()
	{
		Scanner clavier = new Scanner(System.in);
		// Niveau 0: Faire un Hello World:
		System.out.println("Hello World");
		
		// Niveau 1: On demande deux nombres dans la console et on affiche la somme des deux
		System.out.println("Entrez la valeur 1 pour effectuer une somme");
		int somme1 = clavier.nextInt();
		System.out.println("Entrez la valeur 2 pour effectuer une somme");
		int somme2 = clavier.nextInt();
		System.out.println("Voici la somme des 2 valeurs: " + (somme1 + somme2));
		
		// Niveau 2: On demande le prix d'un objet et un pourcentage de remise et on calcule le prix final
		System.out.println("Entrez le prix de l'objet (float avec virgule)");
		float prix = clavier.nextFloat();
		System.out.println("Entrez le pourcentage de remise de l'objet (entier)");
		int remise = clavier.nextInt();
		float prixFinal = prix - (prix*remise/100);
		System.out.println("Voici le prix final de l'objet avec reduction " + prixFinal);
		
		// Niveau 3: en utilisant une valeur intermédiaire
		System.out.println("Entrez la valeur 1");
		int valeur1 = clavier.nextInt();
		System.out.println("Entrez la valeur 2");
		int valeur2 = clavier.nextInt();
		
		System.out.println("Valeur 1: " + valeur1);
		System.out.println("Valeur 2: " + valeur2);
		int valeurTmp = valeur2;
		valeur2 = valeur1;
		valeur1 = valeurTmp;
		System.out.println("Valeur 1: échangée: " + valeur1);
		System.out.println("Valeur 2: échangée: " + valeur2);

		// Niveau 4: Comme le niveau 3 mais interdit de créer d'autres variables que les deux int
		System.out.println("Entrez la valeur 1 volcan");
		valeur1 = (int)clavier.nextInt();
		System.out.println("Entrez la valeur 2 volcan");
		valeur2 = (int)clavier.nextInt();
		
		// Utilisation de l'operator XOR
		valeur1 = valeur1^valeur2;
		valeur2 = valeur1^valeur2;
		valeur1 = valeur1^valeur2;
		
		System.out.println("Valeur 1: échangée volcan: " + valeur1);
		System.out.println("Valeur 2: échangée volcan: " + valeur2);
	}
	
	public static void TP2()
	{
		Scanner clavier = new Scanner(System.in);
		// Niveau 1 : On demande à l'utilisateur/trice combien d'argent il ou elle a sur son compte en banque, si cette personne a au moins 10000€, on lui dit qu'elle peut ouvrir un livret A
		System.out.println("Indiquez le nombre d'argent sur votre compte");
		int variableBanque = clavier.nextInt();
		if (variableBanque >= 10000)
		{
			System.out.println("Vous avez la possibilité d'ouvrir un Livret A");
		}
		
		// NIveau 2 : On rentre 3 nombres dans la console et le programme nous dit s'ils sont croissants
		System.out.println("Entrez la variable 1");
		int variable1 = clavier.nextInt();
		System.out.println("Entrez la variable 2");
		int variable2 = clavier.nextInt();
		System.out.println("Entrez la variable 3");
		int variable3 = clavier.nextInt();
		
		if (variable1 <= variable2 && variable2 <= variable3)
		{
			System.out.println("Les variables 1, 2 et 3 sont dans l'ordre croissant");
		}
		
		// Niveau 3 : On affiche dans la console les chiffres de 0 à 1000
		for (int i = 0; i <= 1000; i++) // 1000 Inclut
		{
			System.out.println("Iteration de la boucle: " + i);
		}
		
		// Niveau 4 : Un programme qui demande une entrée à l'utilisateur jusqu'à ce qu'il rentre la lettre "q" pour quitter le programme
		String input = "";
		do
		{
			System.out.println("Veuillez entrer la lettre q afin de quitter la boucle");
			input = clavier.next();
		} while (!input.equals("q")); // bug trouvé...
		
		// Niveau 5 : Comme le niveau 4 mais il faut rentre une voyelle pour quitter le programme
		do
		{
			System.out.println("Veuillez entrer une voyelle afin de quitter la boucle");
			input = clavier.next();
		} while (!(input.equals("a")
			  || input.equals("e")
		      || input.equals("i")
		      || input.equals("o")
		      || input.equals("u")
		      || input.equals("y")));
	    // a, e, i, o, u, y
		
		// Niveau 6 : Le FizzBuzz
		for (int i = 1; i <= 1000; i++)
		{
			// Dans le cas divisible par 3 et 5
			if (i%3 == 0 && i%5 == 0)
			{
				System.out.print("FIZZBUZZ");
			}
			else if (i%3 == 0)
			{
				System.out.print("FIZZ");
			}
			else if (i%5 == 0)
			{
				System.out.print("BUZZ");
			}
			else
			{
				System.out.print(i);
			}
			System.out.print(" ");
		}

		// Niveau 7 : Comptage vert du seven wonders
		System.out.println("Comptage du seven wonders:");
		System.out.println("Veuillez entrer le nombre de parpins");
		int nombreDeParpins = clavier.nextInt();
		System.out.println("Veuillez entrer le nombre de compas");
		int nombreDeCompas = clavier.nextInt();
		System.out.println("Veuillez entrer le nombre de roues");
		int nombreDeRoues = clavier.nextInt();
		
		// Je compte le nombre de lignes des cartes vertes
		// Je rajoute 7 pour chaque ligne entière
		int comptageLignes = 0;
		int ligneIndex = 1;
		while(true)
		{
			if (nombreDeParpins >= ligneIndex && nombreDeCompas >= ligneIndex && nombreDeRoues >= ligneIndex)
			{
				comptageLignes += 7;
				ligneIndex += 1;
			}
			else
			{
				break;
			}
		}
		
		System.out.println("Vous avez " + comptageLignes + " de points de lignes vertes");
		
        int comptageParpins = nombreDeParpins*nombreDeParpins;
        int comptageCompas = nombreDeCompas*nombreDeCompas;
        int comptageRoues = nombreDeRoues*nombreDeRoues;
		
		int pointsWonders = comptageLignes + comptageParpins + comptageCompas + comptageRoues;
        System.out.println("Vous avez un total de " + pointsWonders + " points de cartes vertes");
        
        // Niveau 8 : Les bougies
 		System.out.println("Nombre de bougies:");
 		int nombreDeBougies = clavier.nextInt();
 		int totalDeBougies = nombreDeBougies;
 		while (nombreDeBougies > 2)
 		{
 			nombreDeBougies = nombreDeBougies/3;
 			System.out.println("Reste de bougies: " + nombreDeBougies);
 			totalDeBougies += nombreDeBougies;
 		}
        System.out.println("Total de bougies fin: " + totalDeBougies);
        clavier.close();
	}
	
	public static void TP3()
	{
		// Niveau 1
		Scanner clavier = new Scanner(System.in);
		System.out.println("Veuillez entrer le nombre d'étoiles");
		int nombreEtoiles1 = clavier.nextInt();
		for (int i = 0; i < nombreEtoiles1; i++)
		{
			System.out.println("*");
		}
		
		// Niveau 2
		System.out.println("Veuillez entrer le nombre d'étoiles");
		int nombreEtoiles2 = clavier.nextInt();
		for (int i = 0; i < nombreEtoiles2; i++)
		{
			System.out.print("*");
			for (int j = 0; j < nombreEtoiles2; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// Niveau 3
		System.out.println("Veuillez entrer le nombre d'étoiles");
		int nombreEtoiles3 = clavier.nextInt();
		for (int i = 0; i < nombreEtoiles3; i++)
		{
			System.out.print("*");
			for (int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// Niveau 4
		System.out.println("Veuillez entrer le nombre d'étoiles");
		int nombreEtoiles4 = clavier.nextInt();
		for (int i = 1; i <= nombreEtoiles4; i++)
		{
			int nombreEtoilesEcrites = i*2;
			int nombreEspacesEcrites = nombreEtoiles4-i;
			
			for (int indexEsp = 0; indexEsp < nombreEspacesEcrites; indexEsp++)
				System.out.print(" ");
			for (int indexEt = 0; indexEt < nombreEtoilesEcrites; indexEt++)
				System.out.print("*");
			
			// Il n'y en a pas vraiment beson mais pourrait être utile
			for (int indexEsp = 0; indexEsp < nombreEspacesEcrites; indexEsp++)
				System.out.print(" ");
			
			System.out.println("");
		}		
		
		// Niveau 5
		System.out.println("Veuillez entrer le nombre d'étoiles");
		int nombreEtoiles5 = clavier.nextInt();
		for (int i = 0; i < nombreEtoiles5; i++)
		{
			boolean parite = (i%2 == 0);
			
			for (int j = 0; j < nombreEtoiles5; j++)
			{
				if (parite)
					System.out.print("*");
				else
					System.out.print(" ");
				
				parite = !parite;
			}
			
			System.out.println("");
		}
		
		clavier.close();
	}
}
