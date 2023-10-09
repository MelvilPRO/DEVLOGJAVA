package POO;

public class Arme {
	private String name;
	private int damage;
	
	public Arme(String nameInit, int damageInit)
	{
		this.name = nameInit;
		this.damage = damageInit;
	}
	
	public String GetName()
	{
		return name;
	}
	
	public void SetName(String name)
	{
		this.name = name;
	}
	
	public int GetDamage()
	{
		return damage;
	}
	
	public void SetDamage(int damage)
	{
		this.damage = damage;
	}
	
	public String toString() 
	{
		String result = "";
		result += "Nom de l'arme: " + this.name + "\n";
		result += "Nombre de dégats de l'arme: " + this.damage + "\n";
		System.out.println(result);
		return result;
	}
}
