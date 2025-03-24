package jenni;

public class nestedlogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int y=1;y<=100;y++)
		{
			//if(y%3==0)  
			if(y%3==0 && y%7==0 && y%10!=0)
			{
				//if(y%7==0)
				//{
					System.out.println("Number is__"+y);
				}
			}
		}

	}


