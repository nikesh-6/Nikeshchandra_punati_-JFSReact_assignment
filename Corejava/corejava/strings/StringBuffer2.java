package strings;

public class StringBuffer2 {

	public static void main(String[] args) {

        StringBuffer S = new StringBuffer("it is used to _ at the specified index position");

        System.out.println("string buffer before inserting = " + S);
        S.replace(14,  15,"insert text");


        System.out.println("After replacing string buffer= " + S);

	}

}
