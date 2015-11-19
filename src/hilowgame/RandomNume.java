package hilowgame;

import java.util.Random;

public class RandomNume {

	private int high;
	private int low;
	
	public RandomNume(int high)
	{
		this.high = high;
	}
	
	public RandomNume(int lo, int hi)
	{
		low = lo;
		high = hi;
	}
	
	public void setLowNumber(int newLow)
	{
		low = newLow; // sets low
	}
	
	public void setHighNumber(int newHigh)
	{
		high = newHigh; // sets high
	}
		
	public int getHighNumber()
	{
		return high;     // gets high number
	}
	
	public int getLowNumber()
	{
		return low;    // gets low Number
	}
	
		public int GetANumber()
		{
			Random rand = new Random();          
			return rand.nextInt(high+1)+low;
		}
		
		public int GetANumber(int high)
		{
			Random rand = new Random();           
			return rand.nextInt(high + 1);
		}
		
		public int GetANumber(int lo, int hi)
		{
			Random rand = new Random();
			return rand.nextInt(hi - lo + 1) + lo;
}
}
