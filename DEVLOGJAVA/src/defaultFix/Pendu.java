package defaultFix;
import java.util.Scanner;

public class Pendu {
	static final int NUMBER_OF_LINES_TO_CLEAR = 100;
	static final Scanner CLAVIER = new Scanner(System.in);
	public static void main(String[] args)
	{
		LancerPartie();
	}
	
	public static void LancerPartie()
	{
		System.out.println("Entrez un mot a chercher:");
		String chaineATrouver = CLAVIER.next();
		chaineATrouver = chaineATrouver.toLowerCase();
		String chaineModifiee = "";
		for (int i = 0; i < chaineATrouver.length(); i++)
			chaineModifiee += "*";
				
		ClearConsole();
		System.out.println("Voici la chaine la chaine que vous devez chercher, bonne chance!\n");
		
		int missingTimes = 0;
		String alreadyTried = "";
		while (!chaineATrouver.equals(chaineModifiee))
		{
			System.out.println(chaineModifiee);
			if (alreadyTried.length() > 0)
				System.out.println("Entrez une lettre qui ne fait pas partie de cette liste: " + alreadyTried);
			else
				System.out.println("Entrez une lettre");
			
			String input = CLAVIER.next();
			input = input.toLowerCase();
			/* Ne peut être vide ou avoir une taille différente que le mot défini */
			if (input.length() > 1 && input.length() != chaineATrouver.length())
			{
				System.out.println("L'entrée ne peut être vide ou avoir une taille différente du mot d'origine");
				continue;
			}
			
			/* Tentative du mot entier réussite */
			if (input.length() == chaineATrouver.length() && input.equals(chaineATrouver))
				break;
			
			/* Dans le cas d'un seul caractère on peut rajouter la lettre
			 * Directement dans la liste des lettres déjà utilisées par l'utilisateur
			 */
			if (input.length() == 1)
				alreadyTried += input;
			
			/* Ici il faut trouver le nombre d'occurences du caractère 
			 * Ensuite on trouve chacun de leur index, puis
			 * On applique a chaque index la lettre a chaineModifiee
			 */
			int occurrencesTotal = CountSubstrings(chaineATrouver, input);
			for (int occurrencesIndex = 0; occurrencesIndex < occurrencesTotal; occurrencesIndex++)
			{
				int occurrencePos = chaineATrouver.indexOf(input);
				
				String part1 = chaineModifiee.substring(0, occurrencePos);
	            String part2 = chaineModifiee.substring(occurrencePos + 1);
	            chaineModifiee = part1 + input + part2;
			}
			
			/* Si c'est un rateau */
			if (occurrencesTotal == 0)
			{
				System.out.println("Raté, essaye encore!");
				missingTimes++;
			}
			else if (!input.equals(chaineATrouver))
			{
				System.out.println("Trouvé, continue encore!");
			}
		}
		
		System.out.println("Vous avez terminé le pendu en " + missingTimes + " coups de trop!");
		System.out.println("Et voici les lettres utilisées: " + alreadyTried);
	}
	
	
	public static void ClearConsole()
	{
		for (int lineIndex = 0; lineIndex < NUMBER_OF_LINES_TO_CLEAR; lineIndex++)
			System.out.println("");
	}
	
	/* Merci Chat-GPT pour cet algorithme efficace */
	public static int CountSubstrings(String text, String substring) {
        int count = 0;
        int index = text.indexOf(substring);

        while (index != -1) {
            count++;
            index = text.indexOf(substring, index + 1);
        }

        return count;
    }
}
