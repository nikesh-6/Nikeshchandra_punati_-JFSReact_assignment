package lol;
public class Armstrong_range {

	public static void main(String[] args) {
		int temp;
		int number;
		System.out.println("Armstrong nmber between 100 -999 are :");
		for (int i=100;i<=999;i++) {
			number =i;
			int sum=0;
			while(number>0) {
				temp=number%10;
				sum=sum+(temp*temp*temp);
				number =number/10;
			}
			if(sum == i) {
				System.out.println(i+ "is a Armstrong number");
			}
		}
		

	}

}
