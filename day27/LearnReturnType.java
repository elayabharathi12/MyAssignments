package week1.day27;

public class LearnReturnType {
	
	
	public void addTwoNumber() {
		int a=5;
		int b=10;
		System.out.println(a+b);
		
	
	}
	
	public int addThreeNumbers(int a,int b,int c) {
		return a+b+c;
		

	}
	
	public boolean switchOff() {
		return true;

	}
	
	public static void main(String[] args) {
		LearnReturnType lr= new LearnReturnType();
		lr.addTwoNumber();
		int result = lr.addThreeNumbers(20, 35, 90);
		System.out.println(result);
		boolean ans = lr.switchOff();
		System.out.println(ans);
	}
		

}


	
