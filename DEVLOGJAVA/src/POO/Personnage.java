package POO;
import java.util.ArrayList;

public class Personnage 
{
	private int hitpoints;
	private String name;
	private Arme weapon;
	
	public Personnage(int hitpointsInit, String nameInit, Arme weaponInit)
	{
		this.hitpoints = hitpointsInit;
		this.name = nameInit;
		this.weapon = weaponInit;
	}
	
	public void Attack(Personnage aPersonnage)
	{
		int currentHitpoints = aPersonnage.GetHitpoints();
		currentHitpoints -= this.weapon.GetDamage();
		aPersonnage.SetHitpoints(currentHitpoints);
	}
	
	public void Attack(ArrayList<Personnage> aPersonnages)
	{
		for (int personnageIndex = 0; personnageIndex < aPersonnages.size(); personnageIndex++)
		{
			Personnage currentPersonnage = aPersonnages.get(personnageIndex);
			Attack(currentPersonnage);
		}
	}
	
	public int GetHitpoints()
	{
		return hitpoints;
	}
	
	public void SetHitpoints(int hitpoints)
	{
		this.hitpoints = hitpoints;
	}
	
	public String GetName()
	{
		return name;
	}
	
	public void SetName(String name)
	{
		this.name = name;
	}
	
	public Arme GetWeapon()
	{
		return weapon;
	}
	
	public void SetWeapon(Arme weapon) 
	{
		this.weapon = weapon;
	}
	
	public String toString() 
	{
		String result = "";
		result += "Nom du personnage: " + this.name + "\n";
		result += "Nombre de hitpoints: " + this.hitpoints + "\n";
		result += this.weapon.toString();
		System.out.println(result);
		return result;
	}
}
