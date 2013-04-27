package TrabalhoI.GrupoI.Meal;

public class MealsPrint {

	public static void print(Meal [] meals){
		System.out.println ("Refeição		Preço");
		for (int i = 0; i < meals.length ; ++i)
			System.out.println (meals[i].getName() + "			" + meals[i].getPrice());
		
		
		System.out.println ("Total Preços: " + getTotalPrice(meals));
		System.out.println ("Total Descontos: " + getTotalDiscount(meals));
		System.out.println ("Refeição mais cara		Refeição mais barata");
		System.out.println (getPriceMealExpensiveAndCheap(meals));
		
	}// Retorna nome e o preço  de  cada refeição e no fim: o somatório dos preços;
	//o somatório dos descontos; o preço da  refeição mais cara; e o preço da refeição mais barata.

	private static double getTotalDiscount(Meal[] meals) {
		double totalDiscount = 0;
		for(int i = 0; i<meals.length; ++i){
				totalDiscount += meals[i].d.getDiscount();
		}
		return totalDiscount;
	}// Retorna o desconto total dos menus contidos no array de menus

	private static double getTotalPrice(Meal[] meal) {
		double price = 0;
		for(int i = 0; i<meal.length; ++i)
			price += meal[i].getPrice();
		return price;
	}	// Retorna o preço total dos menus contidos no array de menus
	
	private static String getPriceMealExpensiveAndCheap(Meal[] meal) {  
		double cheap = meal[0].getPrice(), expensive = 0;
		for (int i = 1; i < meal.length ; ++i)
		{
			if (cheap < meal[i].getPrice())
				expensive = meal[i].getPrice();
			else if (cheap > meal[i].getPrice()){
				expensive = cheap;
				cheap = meal[i].getPrice();
			}
			else if (cheap == meal[i].getPrice()){
				cheap = meal[i+1].getPrice();
				++i;
			}
		}
		return expensive + "				" + cheap;
	}	// Retorna a refeição mas cara e a mas barata
}
