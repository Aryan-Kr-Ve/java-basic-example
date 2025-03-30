package jenni;
class tt extends Thread
{
	public void run()
	{
		try {
		for(int i=1;i<=10;i++)
		{
			Thread.sleep(1000);
			System.out.print(i);
		}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}	

}
	}
	
public class exteth1 {

	public static void main(String[] args) {
		
		tt t=new tt();
		t.start();
	

	}

}
