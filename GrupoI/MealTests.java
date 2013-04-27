package TrabalhoI.GrupoI;

import junit.framework.Assert;
import org.junit.Test;
import TrabalhoI.GrupoI.Dish.Dish;
import TrabalhoI.GrupoI.Meal.*;

public class MealTests {
	
	public static void main (String [] args){
		Meal meal=new MealWithOffer( new Dish( "café", 0.5 ) );
		meal.addDish( new Dish( "espetadas", 8.5 ) ); 
		meal.addDish( new Dish( "salada de frutas", 1.8 ) ); 
		meal.printMeal(); 
	}
	
}
