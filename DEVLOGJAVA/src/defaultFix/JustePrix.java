package defaultFix;
import java.util.Scanner;

public class JustePrix {
	static Scanner clavier = new Scanner(System.in);
	final static int DIFFICULTE_SIMPLE = 1;
	final static int DIFFICULTE_NORMAL = 2;
	final static int DIFFICULTE_DIFFICILE = 3;
	final static int DIFFICULTE_EXTREME = 4;
	final static int DIFFICULTE_HARDCORE = 5;
	
	public static void main(String[] args) {	
		do
		{
			LancerPartie();
		} while(Relancer());
		
		System.out.println("Algorithme de jeu terminé!");
	}

	public static void LancerPartie() {
		int userRangeMin = 1;
		int userRangeMax = DifficulteUserInput();
		
		int aTrouver = NombreAleatoire(userRangeMin, userRangeMax);
		System.out.println("Démarrage de la partie! Essayez de trouver un nombre entre " + userRangeMin + " et " + userRangeMax);
		
		int userCount = 1;
		int userInput = clavier.nextInt();
		while (userInput != aTrouver)
		{
			if (userInput < aTrouver)
				System.out.println("C'est plus !");
			else
				System.out.println("C'est moins !");
			
			userInput = clavier.nextInt();
			userCount++;
		}
		
		System.out.println("C'est gagné! Vous avez trouvé le nombre en " + userCount + " tentatives!");
	}
	
	public static int DifficulteUserInput()
	{
		System.out.println("Choisissez un niveau de difficulté!");
		System.out.println("1 : 100");
		System.out.println("2 : 1000");
		System.out.println("3 : 10000");
		System.out.println("4 : 100000");
		System.out.println("5 : 1000000");
		int userRangeMax = 0;
		do
		{
			int userInputRange = clavier.nextInt();
			switch (userInputRange)
			{
			case DIFFICULTE_SIMPLE:
				userRangeMax = 100;
				break;
			case DIFFICULTE_NORMAL:
				userRangeMax = 1000;
				break;
			case DIFFICULTE_DIFFICILE:
				userRangeMax = 10000;
				break;
			case DIFFICULTE_EXTREME:
				userRangeMax = 100000;
				break;
			case DIFFICULTE_HARDCORE:
				userRangeMax = 1000000;
				break;
			default:
				System.out.println("Nombre de difficulté inconnu!");
				System.out.println("Veuillez choisir le nombre correspondant à la difficulté!");
			}
		} while (userRangeMax == 0);
		return userRangeMax;
	}
	
	public static boolean Relancer()
	{
		System.out.println("Voulez-vous relancer une partie ?");
		String input = clavier.next();
		return input.equals("Yes");
	}
	
	// Utilisation de Chat-GPT, min est inclus et max exclus
	public static int NombreAleatoire(int min, int max) {
        int randomInt = (int) (Math.random() * (max - min + 1)) + min;
        return randomInt;
    }
}
