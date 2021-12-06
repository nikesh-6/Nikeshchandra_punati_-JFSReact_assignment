package lambda;
interface Acceptedcompleted {
	void check(int a);
}
		

public class Orders {
	
		public static void main(String[] args) {
			// Lambda Expression
			Acceptedcompleted acceptedcompleted = (int a) -> {
				if(a>10000){
					System.out.println("Number "+a+" is ACCEPTED,COMPLETED.");
				}else{
					System.out.println("Number "+a+" is NOT ACCEPTED .");
				}
			};
			acceptedcompleted.check(10000);
			acceptedcompleted.check(20000);
		}
	}