package defaultFix;

public class Sudoku {

	public static void main(String[] args) {
		int[][][][] grille = {
			{
				{
					{1, 0, 0}, 
					{0, 5, 0}, 
					{0, 0, 0}
				},
				{
					{0, 8, 0}, 
					{6, 0, 1}, 
					{5, 0, 3}
				},
				{
					{0, 0, 9}, 
					{0, 2, 0}, 
					{0, 0, 0}
				}	
			},
			{
				{
					{0, 9, 6}, 
					{3, 0, 0}, 
					{0, 1, 5}
				},
				{
					{1, 0, 4}, 
					{0, 6, 0}, 
					{9, 0, 8}
				},
				{
					{8, 3, 0}, 
					{0, 0, 5}, 
					{4, 6, 0}
				}	
			},
			{
				{
					{0, 0, 0}, 
					{0, 8, 0}, 
					{5, 0, 0}
				},
				{
					{7, 0, 5}, 
					{3, 0, 9}, 
					{0, 1, 0}
				},
				{
					{0, 0, 0}, 
					{0, 7, 0}, 
					{0, 0, 3}
				}	
			}
		};
		System.out.println("Voici la grille du Sudoku avant résolution:");
		Afficher(grille);
		grille = Resoudre(grille);
		Afficher(grille);
	}
	
	public static void Afficher(int[][][][] aGrille)
	{
		/*
		for (int ligneBlocks = 0; ligneBlocks < aGrille.length; ligneBlocks++)
		{
			int[][][] ligneBlock = aGrille[ligneBlocks];
			for (int colonneBlocks = 0; colonneBlocks < ligneBlock.length; colonneBlocks++)
			{
				int[][] colonneBlock = ligneBlock[colonneBlocks];
				for (int ligneTables = 0; ligneTables < colonneBlock.length; ligneTables++)
				{
					int[] ligneTable = colonneBlock[ligneTables];
					for (int valueIndex = 0; valueIndex < ligneTable.length; valueIndex++)
					{
						System.out.print(ligneTable[valueIndex]);
					}
					System.out.println("");
				}
			}
		}
		*/
		
		/* Merci Chat-GPT pour ce magnifique design */
		for (int ligneEntiere = 0; ligneEntiere < 9; ligneEntiere++) {
		    if (ligneEntiere % 3 == 0 && ligneEntiere != 0)
		        System.out.println("------+-------+------");
		    
		    for (int colonneEntiere = 0; colonneEntiere < 9; colonneEntiere++)
		    {
		        if (colonneEntiere % 3 == 0 && colonneEntiere != 0)
		            System.out.print("| ");

		        int valeur = aGrille[ligneEntiere / 3][colonneEntiere / 3][ligneEntiere % 3][colonneEntiere % 3];
		        if (valeur == 0)
		        /* Affiche un espace vide, la valeur ne peut être 0 */
		            System.out.print("  ");
		        else 
		            System.out.print(valeur + " ");
		    }
		    System.out.println("");
		}
	}
	
	public static int[][][][] Resoudre(int[][][][] aGrille)
	{	
		int securiteInfinie = 0;
		do {
			System.out.println("Boucle inf");
			
			securiteInfinie++;
		}
		while(!Terminer(aGrille) && securiteInfinie < 100);
		
		System.out.println("L'algorithme de résolution est terminé!");
		return aGrille;
	}
	
	public static boolean Terminer(int[][][][] aGrille)
	{	
		for (int ligneBlocks = 0; ligneBlocks < aGrille.length; ligneBlocks++)
		{
			int[][][] ligneBlock = aGrille[ligneBlocks];
			for (int colonneBlocks = 0; colonneBlocks < ligneBlock.length; colonneBlocks++)
			{
				int[][] colonneBlock = ligneBlock[colonneBlocks];
				for (int ligneTables = 0; ligneTables < colonneBlock.length; ligneTables++)
				{
					int[] ligneTable = colonneBlock[ligneTables];
					for (int valueIndex = 0; valueIndex < ligneTable.length; valueIndex++)
						if (ligneTable[valueIndex] == 0)
							return false;
				}
			}
		}
		return true;
	}
	
	// Utilisation de Chat-GPT, min est inclus et max exclus
	public static int NombreAleatoire(int min, int max) {
        int randomInt = (int) (Math.random() * (max - min + 1)) + min;
        return randomInt;
    }
}
