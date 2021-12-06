package collections;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class LeapYear {
	public static void main(String[] args) {
		
		Date date = new Date("01/09/1999");
			Date date1 = new Date("10/12/2000");
			Date date2 = new Date("18/10/2003");
			
			
			List<Date> dob = new LinkedList<>();
			dob.add(date);
			dob.add(date1);
			dob.add(date2);
			
			 
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			for (int i = 0; i < dob.size(); i++) {
				
				LocalDate up = LocalDate.parse(dob.get(i).date,df);
				String s=(up).format(df);
				 
				  
				if(up.getYear() % 4 == 0) {
					System.out.println(s + " is an leap year");
				}else {
					System.out.println(s + " is not an leap year");
				}
			}
			

	}

}
class Date {
	
	String date;
	
	public Date(String date) {
		super();
		this.date = date;
	}

	@Override
	public String toString() {
		return "[date=" + date + "]";
	}

}	
			
		