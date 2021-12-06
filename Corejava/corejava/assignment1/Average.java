package lol;
import java.util.Scanner;

public class Average {
	
	public static void main(String[] args) {
	
		
			Scanner in=new Scanner(System.in);float total_sum,total_avg,individual_sum,individual_avg;
			System.out.println("Enter the marks of first student: ");
			float a1=in.nextFloat();
			float b1=in.nextFloat();
			float c1=in.nextFloat();
			System.out.println("Enter the marks of second student: ");
			float a2=in.nextFloat();
			float b2=in.nextFloat();
			float c2=in.nextFloat();
			System.out.println("Enter the marks of third student: ");
			float a3=in.nextFloat();
			float b3=in.nextFloat();
			float c3=in.nextFloat();
			total_sum=a1+a2+a3+b1+b2+b3+c1+c2+c3;
			total_avg=total_sum/9;
			System.out.println("Total sum = "+total_sum+" ,"+"Total average = "+total_avg);
			individual_sum=a1+a2+a3;
			individual_avg=individual_sum/3;
			System.out.println("Total sum and Average of students in sub 1 = "+individual_sum+","+individual_avg);
			individual_sum=b1+b2+b3;
			individual_avg=individual_sum/3;
			System.out.println("Total sum and Average of students in sub 2 = "+individual_sum+","+individual_avg);
			individual_sum=c1+c2+c3;
			individual_avg=individual_sum/3;
			System.out.println("Total sum and Average of students in sub 3 = "+individual_sum+","+individual_avg);
	}

}
