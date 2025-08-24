package jenni;

abstract class xyz {
	abstract void call();
	void display()
	{
		System.out.println("From_Display");
	}
}
class b extends xyz
{
	void call()
	{
		System.out.println("From_Call");


	}
	
}
public class abclass
{
public static void main(String args[])
{
	b obj=new b();
	obj.call();
	obj.display();
}
}
