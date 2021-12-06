package strings;

public class StringBuffer3 {

	public static void main(String[] args) {

        StringBuffer S = new StringBuffer("This method returns the reversed object on which it was called");
        System.out.println("before reversing string is: "+S);

        StringBuffer s2=S.reverse();
        System.out.println("After reversing the string = " + s2);


	}

}
