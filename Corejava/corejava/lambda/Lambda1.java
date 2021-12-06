package lambda;
@FunctionalInterface
interface ArithematicOperations
{
    void display(int a, int b);
}
class Lambda1
{
    public static void main(String[] args) {
        ArithematicOperations a1=(a,b)->{
            System.out.println("addition is: "+(a+b));
            System.out.println("subtraction is: "+(a-b));
            System.out.println("multiplication is:"+(a*b));
            System.out.println("division is :" +(a/b));
        };
            a1.display(10, 20);
        System.out.println(" ");
        a1.display(20,30);


    }
}

