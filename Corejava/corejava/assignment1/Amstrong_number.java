package lol;
import java.util.Scanner;
public class Amstrong_number {

	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		System.out.println("enter a number");
		int a=scr.nextInt();
		int sum =0;
		int temp;
		int number =a;
		while(a!=0) {
			temp=a%10;
			sum=sum+(temp*temp*temp);
			a=a/10;
		}
		if(sum==number) {
			System.out.println(number +" is a Armstrongnumber");
		}
		else {
			System.out.println(number  +" not a Armstrongnumber");
		}

	}

}
