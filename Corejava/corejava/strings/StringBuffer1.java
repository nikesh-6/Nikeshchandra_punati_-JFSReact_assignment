package strings;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("String Buffer");
        System.out.println(" Before appending String is:--- " +s1);

        s1.append(" is a peer class of String");
        s1.append(" that provides much of");
        s1.append(" the functionality of strings");
        System.out.println(" After Appending String is:--" +s1);
	}

}
