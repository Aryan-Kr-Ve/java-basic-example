package jenni;

public class Exphar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
		for(int i=5;i>=0;i--)
		try {
			int j=a/i;
		}
		catch(ArithmeticException a1)
		{
			System.out.println(a1.getMessage());
			System.out.println("Arithmetic Exception occured");
		}
		finally {
			System.out.println("Finally Block is Working");
		}
			
		
	}

}
