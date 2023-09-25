package defaultFix;
import java.util.Scanner;

public class JustePrix {
	static Scanner clavier = new Scanner(System.in);
	
	public static void main(String[] args) {	
		do
		{
			LancerPartie();
		} while(Relancer());
		
		System.out.println("Algorithme de jeu terminé!");
	}

	public static void LancerPartie() {
		int aTrouver = NombreAleatoire(1, 100);
		System.out.println("Démarrage de la partie! Essayez de trouver un nombre entre 1 et 100");
		
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
