package strings;

public class Stringbuilder2 {

	public static void main(String[] args) {
		StringBuilder S = new StringBuilder("it is used to _ at the specified index position");

        System.out.println("string buffer before inserting = " + S);
        S.replace(14,  15,"insert text");


        System.out.println("After replacing string buffer= " + S);

	}

}
