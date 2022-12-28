package week1.day27;

public class Calculater {
	public void subTwoNumber() {
		int a=30;
		int b=45;
		System.out.println(a-b);
		
	
	}
	
	public int multipyTwoNumbers(int a,int b) {
		return a*b;
		

	}
	
	public boolean doorLock() {
		return false;

	}
	
	public static void main(String[] args) {
		Calculater cl= new Calculater();
		int result = cl.multipyTwoNumbers(20, 45);
		System.out.println(result);
		boolean ans = cl.doorLock();
		System.out.println(ans);
		
	}
		

}


	

