package jenni;

public class thr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("Aryan");
		System.out.println(t);
		System.out.println(t.getId());
		System.out.println(t.getPriority());
		System.out.println(t.getState());
	}

}
