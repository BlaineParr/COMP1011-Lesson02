/**
 * 
 * @author Blaine Parr
 * @version January 15, 2015
 */
public class Hero 
{
	//Private properties +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	protected int strength;
	protected int speed;
	private int health;
	
	//public properties ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public String name;
	
	//Getter section +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public int getStrength() 
	{
		return strength;
	} //method getStrength ends

	public int getSpeed() 
	{
		return speed;
	} //method getSpeed ends

	public int getHealth() 
	{
		return health;
	} //method getHealth ends

	//Constructor ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Hero(String name)
	{
		this.name = name;
		generateAbilities();
	} //constructor ends
	
	//Public Methods +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public void showAbilities()
	{
		System.out.println("++++++++++\nStrength: " + this.strength + "\nSpeed: " + this.speed + "\nHealth: " + this.health + "\n++++++++++");
	} //method showAbilities ends
	
	public void fight()
	{
		System.out.println(this.name + " is fighting!");
	} //method fight ends
	
	public void run()
	{
		System.out.println(this.name + " is running!");
	} //method run ends
	
	//Private methods ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private void generateAbilities()
	{
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	} //method generateAbilities ends
} //class Hero ends
