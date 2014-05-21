package threadedMath;

public class Multiplier implements Runnable
{
	private int number1, number2;
	
	Multiplier(int passNumber1, int passNumber2)
	{
		this.number1 = passNumber1;
		this.number2 = passNumber2;
	}
	
	public void run()
	{
		System.out.println(number1 + "*" + number2 + " = " + (number1*number2));
	}
}

