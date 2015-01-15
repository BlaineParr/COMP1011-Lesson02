
public class Villain extends Hero 
{
	//Constructor ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Villain(String name) 
	{
		super(name);
	} //constructor ends
	
	//Public methods +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public void steals()
	{
		System.out.println(name + " is stealin'!");
	} //method steals ends
	
	public void kills()
	{
		System.out.println(this.name + " is goin' around killin'!");
	} //method kills ends
} //class Villain ends
