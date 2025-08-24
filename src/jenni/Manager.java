package jenni;

public class Manager {
       static int roll;
		static String name;
		static double marks;
	//constructor
		Manager(){
			roll=400;
			name="Aryan Verma";
			marks=700;
		}
		//Function
		void data(int r,String n,double m) {
			
			roll=r;
			 
			name=n;
			marks=m;
			
		}
		void display()
		{System.out.println("Roll No=n"+roll);
		System.out.println("Name="+name);
		System.out.println("Marks="+marks);
	
		}
}
class abcdef {
			public static Void main(String [] args)
			{
				Manager obj=new Manager();
				obj.data(001, "Emma", 695);
				obj.display();
				Manager obj1=new Manager();
				obj1.data(002, "Nancy", 400);
				obj1.display();
				return null;
			}
		}
		
		

	

