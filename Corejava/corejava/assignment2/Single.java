package oops;

public class Single {
	
	    private static Single t=new Single();
	    private Single ()
	    {

	    }
	    public static Single getSingle()
	    {
	        return t;
	    }
	
	class Many extends Single
	{
	   
	}
}
