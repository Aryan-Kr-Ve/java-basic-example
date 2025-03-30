package jenni;

	class abc implements Runnable
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
		
	public class iruni {

		public static void main(String[] args) {
			
			tt t=new tt();
			Thread tp=new Thread(t);
			tp.start();
			
	}

}
