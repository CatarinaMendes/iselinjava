package TrabalhoI.GrupoI;

import junit.framework.Assert;
import org.junit.Test;
import TrabalhoI.GrupoI.Dish.Dish;
import TrabalhoI.GrupoI.Meal.*;

public class MealTests {
	
	public static void main (String [] args){
		
		
		Dish d = new Dish( "café", 0.5 );
		Assert.assertEquals (0.5 , d.getPrice());
		
		Meal meal=new MealWithOffer( new Dish( "caf�", 0.5 ) );
		meal.addDish( new Dish( "espetadas", 8.5 ) ); 
		meal.addDish( new Dish( "salada de frutas", 1.8 ) ); 
		meal.printMeal(); 
		
		menu.addDish( new Dish( "sopa de cenoura", 1.5 ) ); 
		menu.addDish( new Dish( "bacalhau", 7.5 ) );
		menu.addDish( new Dish( "pudim", 1.8 ) ); 
		Assert.assertTrue("erro na classe Meal", menu.printMeal()== (€ 1.5 sopa de cenoura \n € 7.5 bacalhau \n € 1.8 pudim \n ---------------- \n Menu do dia: € 9.0))
	
	// vamos criar outro objecto do tipo Meal e seguidamente incluis os 2 objectos Meal no array Meal
		
		Meal othermeal = new TodayMenu ("sopa de cenoura", "espetadas", "salada de frutas", 9.0);
		menu.addDish( new Dish( "sopa de cenoura", 1.5 ) ); 
		menu.addDish( new Dish( "espetadas", 7.5 ) );
		menu.addDish( new Dish( "salada de frutas", 1.8 ) ); 
		
		Meal [] refeiçoes = new Meal [2];
		refeiçoes [0] = meal;
		refeiçoes [1] = othermeal;
		
		
	// vamos testar se o print(Meal [] meal) funciona
	
		Assert.assertTrue("erro no print( Meal [])", print(refeiçoes)== ("Refeição		Preço" \n "Refeição com oferta de café" + "			" + 9.0 \n 
	
		public static void print(Meal [] meals){
		System.out.println ("Refeição		Preço");
		for (int i = 0; i < meals.length ; ++i)
			System.out.println (meals[i].getName() + "			" + meals[i].getPrice());
		
		
		System.out.println ("Total Preços: " + getTotalPrice(meals));
		System.out.println ("Total Descontos: " + getTotalDiscount(meals));
		System.out.println ("Refeição mais cara		Refeição mais barata");
		System.out.println (getPriceMealExpensiveAndCheap(meals));
		
		
		
	}
	
}
