
public class Vigilante extends Villain 
{
	//Constructor ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Vigilante(String name) 
	{
		super(name);
	} //constructor ends

	//Public methods +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public void dealsJustice()
	{
		System.out.println(this.name + " is dealin' Justice! No need for Judge Judy!");
	}
} //class Vigilante ends
