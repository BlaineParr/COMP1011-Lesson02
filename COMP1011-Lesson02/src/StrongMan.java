
public class StrongMan extends Hero 
{
	//Constructor ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public StrongMan(String name) 
	{
		super(name);
		boostStrength();
	} //constructor ends

	//Private methods ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private void boostStrength()
	{
		this.strength += 50;
		if(this.strength > 100)
		{
			this.strength = 100;
		} //if
	} //method boostStrength ends
	
} //class StrongMan ends
