package lambda;
import java.util.ArrayList;
class Lambda6 {
    public static void main(String[] args) {
        ArrayList<String> replace = new ArrayList<>();
        replace.add("nikesh");
        replace.add("ram");
        replace.add("sachin");
        replace.add("geetha");
        replace.add("messi");

      replace.replaceAll((String) ->
             String.equals(replace) ? String:String.toUpperCase()); //replacing replace elements to uppercase//

        System.out.println(replace); //printing words after changing to upper case
    }
}

