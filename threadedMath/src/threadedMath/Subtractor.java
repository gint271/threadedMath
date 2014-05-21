package threadedMath;

public class Subtractor implements Runnable
{
	private int number1, number2;
	
	Subtractor(int passNumber1, int passNumber2)
	{
		this.number1 = passNumber1;
		this.number2 = passNumber2;
	}
	
	public void run()
	{
		System.out.println(number1 + "-" + number2 + " = " + (number1-number2));
	}
}
