package lol;
import java.util.Scanner;

public class Trow {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("enter X value: ");
	        int x = sc.nextInt();

	        System.out.println("enter Y value: ");
	        int y = sc.nextInt();
	        int z;
	        try {
	        	z=x/y;
	        	if(z==0) {
	        		throw  new UnsupportedOperationException();
	        	}
	        	else {
	        		System.out.println(z);
	        	}
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("not possible");
	}
	    }

	}


