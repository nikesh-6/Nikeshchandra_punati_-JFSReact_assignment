package genrics;
public class New
{
    public static <E> void inter (E[] in)
        {
        E a = in[0];
        in[0]=in[1];
        in[1]=a;

    }

    public static void main(String[] args)
    {
        Integer [] b={5,9};
        System.out.println("Before");
        System.out.println(b[0]+" "+b[1]);
        inter(b);
        System.out.println("After");
        System.out.println(b[0]+" "+b[1]);

    }

}

