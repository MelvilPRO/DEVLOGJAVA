package defaultFix;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
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
}
