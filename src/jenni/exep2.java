package jenni;

public class exep2 {
	
	public static void main(String args [])
	{
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("From Catch="+e);
		}
		finally {
			System.out.println("Alwase run");
		}
	}
}
