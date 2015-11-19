package hilowgame;

public class Die {

	
		private int numDice;	//Keeps track of the number of dice to roll
		final int low = 1; //Tracks the lower bound
		final int high = 6; //Tracks the higher bound
		
		
		public Die(int numDice)  //sets the number of dice
		{
			this.numDice = numDice;
		}
		
		public void setNumDice(int numDice)
		{
			this.numDice = numDice;
		}
		
		public int getNumDice()
		{
			return numDice;
		}
		
		public int roll()
		{
			int total = 0;										//Keeps track of the total roll result
			RandomNume rand = new RandomNume(low, high);	//Our RandomNumber object to generate the dice results
			//Runs once for each dice to roll
			for(int i = 0; i < numDice; i++)
			{
				//"Rolls" a dice and adds that number to the running dice total
				total += rand.GetANumber();
			}
			return total;
		
	}

}
