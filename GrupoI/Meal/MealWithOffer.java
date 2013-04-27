package TrabalhoI.GrupoI.Meal;

import TrabalhoI.GrupoI.Discount;
import TrabalhoI.GrupoI.Dish.Dish;

public class MealWithOffer extends Meal implements Discount {
	
	public MealWithOffer(Dish dish) {
		super("Refeição com oferta de " + dish.getName());
		this.addDish(dish);
	}


	@Override
	public double getDiscount() {
		return this.getPrice();
	}
}
	