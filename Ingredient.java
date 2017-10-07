package edu.ilstu;

	/**
	 * @author John Boomgarden
	 *
	 */
	public class Ingredient 
	{
		private String ingredientName;
		private double amount;
	 	private Conversion conversionRatio;
		public Ingredient(String ingredientName,
				String commercialUnit, String homeUnit, int homeAmount, double conversionRate)
		{
			this.ingredientName = ingredientName;
			this.amount = homeAmount;
			this.conversionRatio = new Conversion(conversionRate, homeUnit, commercialUnit, ingredientName);
		}
		
		public void increaseAmount(double addedAmount)
		{
			this.amount += addedAmount;
		}
		public void decreaseAmount(double addedAmount)
		{
			this.amount -= addedAmount;
		}	
		
		public double getAmount()
		{
			return this.amount;
		}
		
		public double getHomeUnit()
		{
			return this.amount;
		}
		public String getName()	
		{
			return this.ingredientName;
		}
		public void save()
		{
			
		}
		
}
