package jenni;

public class Exha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6,7,8};
int i=10;
try {
	int j=a[i];
}
catch (ArrayIndexOutOfBoundsException e)
{
	System.out.println("Exception Occured");
}
finally {
	System.out.println("Finally Block is Working");
	
}
}
}

