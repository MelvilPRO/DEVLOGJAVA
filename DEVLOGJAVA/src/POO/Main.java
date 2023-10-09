package POO;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Personnage> receveurs = new ArrayList<Personnage>();
		Personnage attaquant = new Personnage(100, "Warrior", new Arme("AK-47", 37));
		
		Personnage P1 = new Personnage(100, "Aie", new Arme("MACHINTRUC", 0));
		Personnage P2 = new Personnage(200, "Aie", new Arme("BIDULETRUC", 0));
		receveurs.add(P1);
		receveurs.add(P2);
		
		attaquant.Attack(receveurs);
		
		for (int i = 0; i < receveurs.size(); i++)
		{
			receveurs.get(i).toString();
		}
	}
}