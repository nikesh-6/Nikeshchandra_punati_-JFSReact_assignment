package lol;

public class str {

	public static void main(String[] args) {
		        String str="Java String Pool refers to collection of Strings which are stored in heap memory";

		        String s1=str.toLowerCase();
		        System.out.println(s1);//converts to lower case//

		        String s2=str.toUpperCase();
		        System.out.println(s2);//converts to upper case//

		        String s3=str.replace('a','$');
		        System.out.println(s3); //replaces a with $ case//

		       if(str.contains("collection")) {
		           System.out.println("contains collection");//checks whether the string contains collection ir not//
		       }
		       else {
		           System.out.println(" not contains collection");
		       }


		       String str1="java string pool refers to collection of strings which are stored in heap memory";
		       if(str.equals(str1)) {
		           System.out.println("strings are matching");//checks string are matching or not//
		       }
		       else {
		           System.out.println("Strings are not matching");
		       }


		     if(str.equalsIgnoreCase(str1)==true){//ingnores casing and checks strings matching or not//
		            System.out.println("Strings are matching");
		        }
		     else {
		         System.out.println("Strings  are not matching");
		     }
		    }
		
}
