package anatations;


	@interface Test
	{

	}
	 class Anno
	{
	    public void sys()
	    {
	        System.out.println("method 1");
	    }
	}
	@Test
	 class Anno1 extends Anno
	{
	    public void sys()
	    {
	        System.out.println("method 2");
	    }
	}

	public class annatations1 {

		public static void main(String[] args) {
			Anno1 a = new Anno1();
	        a.sys();

		}

	}


