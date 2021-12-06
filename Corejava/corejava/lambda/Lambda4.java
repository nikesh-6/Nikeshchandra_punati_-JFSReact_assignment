package lambda;
import java.util.ArrayList;
import java.util.Arrays;

public class Lambda4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("Apple","Banana","Grapes","IceCream","Cakes"));
        for (int i = 0; i <=numbers.size()-1; i++) {
            int a = numbers.get(i).length();
            if (a % 2 !=0) {
                numbers.remove(i);
                
            }
        }
        System.out.println(numbers); //printing only words which have even lengths//
    }
}

