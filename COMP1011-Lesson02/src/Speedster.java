
public class Speedster extends Hero 
{
	//Constructor ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Speedster(String name) 
	{
		super(name);
		boostSpeed();
	} //constructor ends
	
	//Private methods ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private void boostSpeed()
	{
		this.speed += 50;
		if(this.speed > 100)
		{
			this.speed = 100;
		} //if ends
	} //method boostSpeed ends
} //class Speedster ends
