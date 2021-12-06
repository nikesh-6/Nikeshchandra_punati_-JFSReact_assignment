package stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Trader{
	String name;
	String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}

class Transaction{
	Trader trader;
	int year;
	int value;
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
}

public class transactions {

	public static void main(String[] args) {
		
		//adding Traders
				Trader sawan = new Trader("ravi","Indore");
				Trader ana = new Trader("Ananya ","Pune");
				Trader rudy = new Trader("Rudrarup Das","Kolkata");
				Trader madhu = new Trader("Madhurika Dutta","Pune");
				Trader anirban = new Trader("Anirban Dey","Bangalore");
				Trader anik = new Trader("Anik Das","Indore");
		
		//adding transactions
		List<Transaction> t1 = Arrays.asList(
				new Transaction(sawan, 2011, 10),
				new Transaction(ana, 1999, 85),
				new Transaction(madhu, 2020, 25),
				new Transaction(rudy, 2006, 45),
				new Transaction(anik, 2021, 10),
				new Transaction(anirban, 2025, 20),
				new Transaction(madhu, 2003, 75),
				new Transaction(ana, 1999, 85)
				);
		
		
		
		
		List<String> condition = t1.stream()
				.map(t -> t.getTrader().getCity())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(condition);

	}

} 
