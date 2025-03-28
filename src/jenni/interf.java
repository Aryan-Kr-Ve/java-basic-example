package jenni;


interface hello
{
	void call();
}

class a implements hello
{
	
	public void call()
	{
		System.out.println("Hello_Bobby");
	}
	
}

public class interf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a ob=new a();
		ob.call();
		

	}

}
