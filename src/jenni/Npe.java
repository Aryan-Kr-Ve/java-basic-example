package jenni;

public class Npe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        try {
		            String name = null; // not initialized
		            System.out.println(name.length()); // will throw NullPointerException
		        } catch (NullPointerException e) {
		            System.out.println("Oops! You tried to use a null object.");
		        }
		        finally {
					System.out.println("Finally Block is Working");
				}

		        System.out.println("Program continues after handling the exception...");
		    }
		}
