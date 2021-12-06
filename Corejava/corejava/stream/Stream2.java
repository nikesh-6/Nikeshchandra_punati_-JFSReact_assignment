package stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream2 {

	public static void main(String[] args) {
		//create a list of fruit
		List<Fruit> fruits = new ArrayList<Fruit>();
		//adding fruits
		fruits.add(new Fruit("Banana",85,15,"Yellow"));
		fruits.add(new Fruit("Apple",95,15,"Red"));
		fruits.add(new Fruit("Orange",355,15,"Orange"));
		fruits.add(new Fruit("Guava",200,15,"Green"));
		fruits.add(new Fruit("Grapes",101,15,"Light Green"));
		
		Map<String, String> fruitsName = fruits.stream()
				.collect(Collectors.toMap(p->p.color, p->p.name));
		
		
		System.out.println(fruitsName);
		
	}

}

