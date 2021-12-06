package lambda;
public class Lambda5 {

    private static StringBuilder charBuffer = new StringBuilder();

        public static String processWords(String input) {
            String s[] = input.split("(\\s)+");
            for(String values : s)
            {
                charBuffer.append(values.charAt(0));
            }
            return charBuffer.toString();
        }
        public static void main (String[] args) {
            String input = "Lion is king of the jungle";
            System.out.println(processWords(input));//printing string which consist of first letter of each word in a string
        }
    }




