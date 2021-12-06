package strings;

public class Stringbuilder3 {

	public static void main(String[] args) {

        StringBuilder S = new StringBuilder("This method returns the reversed object on which it was called");
        System.out.println("before reversing string is: "+S);

        StringBuilder s2=S.reverse();
        System.out.println("After reversing the string = " + s2);

      
	}

}
