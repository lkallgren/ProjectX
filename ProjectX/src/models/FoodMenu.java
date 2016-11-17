package models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FoodMenu {
	
	 
   private List<Food> foods ;
	
	public List<Food> filterFirstMenu(){
		return foods.stream().filter(food -> food.getMenuType().equals("FIRST")).collect(Collectors.toList());
		}
	
	
			
	public List<Food> findFoods(Predicate<Food> searchCriteria) {
		List<Food> results = new ArrayList<Food>();

		for (Food nextFood : foods) {
			if (searchCriteria.test(nextFood)) {
				results.add(nextFood);
			}
		}
		
		return results;
	}
	
	 
	public FoodMenu() {
		 foods = new ArrayList<Food>();
		 foods.add(new Food(1, 450, "Entrecote with pommes frites",PriceType.FIRST));
		 foods.add(new Food(2, 259, "Scured cod with pilaffrice and asparagus",PriceType.FIRST));
		 foods.add(new Food(3, 199, "Chickencurry with rice",PriceType.ECONOMY));
		 foods.add(new Food(4, 99, "Swedish meatballs, lingonberryjam and potatoes",PriceType.ECONOMY));
		 
		 }


}
