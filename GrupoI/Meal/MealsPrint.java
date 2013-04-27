package TrabalhoI.GrupoI.Meal;

public class MealsPrint {

	public static void print(Meal [] meals){
		System.out.println ("Refei��o		Pre�o");
		for (int i = 0; i < meals.length ; ++i)
			System.out.println (meals[i].getName() + "			" + meals[i].getPrice());
		
		
		System.out.println ("Total Pre�os: " + getTotalPrice(meals));
		System.out.println ("Total Descontos: " + getTotalDiscount(meals));
		System.out.println ("Refei��o mais cara		Refei��o mais barata");
		System.out.println (getPriceMealExpensiveAndCheap(meals));
		
	}// Retorna nome e o pre�o  de  cada refei��o e no fim: o somat�rio dos pre�os;
	//o somat�rio dos descontos; o pre�o da  refei��o mais cara; e o pre�o da refei��o mais barata.

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
	}	// Retorna o pre�o total dos menus contidos no array de menus
	
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
	}	// Retorna a refei��o mas cara e a mas barata
}
