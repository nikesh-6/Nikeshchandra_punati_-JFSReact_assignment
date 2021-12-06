package stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Fruit{
	String name;
	int calories;
	int price;
	String color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}

public class Stream1 {

	public static void main(String[] args) {
		//create a list of fruit
		List<Fruit> fruits = new ArrayList<Fruit>();
		//adding fruits
		fruits.add(new Fruit("Banana",85,15,"Yellow"));
		fruits.add(new Fruit("Apple",95,15,"Red"));
		fruits.add(new Fruit("Orange",355,15,"Orange"));
		fruits.add(new Fruit("Guava",200,15,"Green"));
		fruits.add(new Fruit("Grapes",101,15,"Light Green"));
		
		List<String>fruitsName =  fruits.stream()
				.filter(p-> p.calories<100)
				.map(p -> p.name)
				.collect(Collectors.toList());			
		
		System.out.println("Calories less than 100: " + fruitsName);
		
	}

}

