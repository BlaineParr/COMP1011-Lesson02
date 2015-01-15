/**
 * 
 * @author Blaine Parr
 * @version January 15, 2015
 */
public class Project {

	public static void main(String[] args) 
	{
		//Instantiate hero
		StrongMan hero = new StrongMan("Big Man");
		hero.fights();
		hero.runs();
		hero.showAbilities();
		
		//Instantiate villain
		Villain villain = new Villain("Robin");
		villain.runs();
		villain.steals();
		villain.showAbilities();
		
		//Instantiate vigilante
		Vigilante vigilante = new Vigilante("Steve");
		vigilante.runs();
		vigilante.steals();
		vigilante.dealsJustice();
		vigilante.showAbilities();
	} //method main ends
} //class project ends
