package defaultFix;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Collections {

	public static void main(String[] args)
	{
		PseudosDiscord();
		InverseListe();
		Traduction();
	}

	public static void PseudosDiscord()
	{
		ArrayList<String> pseudosDiscord = new ArrayList<String>();
        pseudosDiscord.add("Thomas");
        pseudosDiscord.add("Sylvio");
        pseudosDiscord.add("Aicha");
        pseudosDiscord.add("Moi");
        
        /* On m'enlève à la fin de la liste */
        pseudosDiscord.remove(pseudosDiscord.size() - 1);
        System.out.println("Liste de pseudos, en enlevant le dernier élement:");
		for (int indexPseudo = 0; indexPseudo < pseudosDiscord.size(); indexPseudo++)
		{
			System.out.println(pseudosDiscord.get(indexPseudo));
		}
	}
	
	public static void InverseListe()
	{
		ArrayList<String> listeNormale = new ArrayList<String>();
		listeNormale.add("A");
		listeNormale.add("B");
		listeNormale.add("C");
		System.out.println("Liste d'origine:");
		for (int indexValue = 0; indexValue < listeNormale.size(); indexValue++)
		{
			System.out.println(listeNormale.get(indexValue));
		}
		
		ArrayList<String> listeInverse = new ArrayList<String>();
		for (int indexValue = listeNormale.size() - 1; indexValue >= 0; indexValue--)
		{
			listeInverse.add(listeNormale.get(indexValue));
		}
		System.out.println("Liste inversée:");
		for (int indexValue = 0; indexValue < listeInverse.size(); indexValue++)
		{
			System.out.println(listeInverse.get(indexValue));
		}
	}
	
	public static void Traduction()
	{
		Hashtable<String, String> frenchEnglish = new Hashtable<String, String>();
		frenchEnglish.put("Bonjour", "Hello");
		frenchEnglish.put("Aurevoir", "Goodbye");
		
		/*
		System.out.println("Voici la traduction de Bonjour en anglais:");
		System.out.println(frenchEnglish.get("Bonjour"));
		System.out.println("Voici la traduction de Aurevoir en anglais:");
		System.out.println(frenchEnglish.get("Aurevoir"));
		*/
		
		/* A la place on parcours chaque valeur - merci ChatGPT */
		for (Map.Entry<String, String> entry : frenchEnglish.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Traduction en anglais de: " + key + " -> " + value);
        }
	}
}
