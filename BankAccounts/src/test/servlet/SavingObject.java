package test.servlet;

public class SavingObject {

	public int readBalance() {
		
		return 1000;
	}

	public int depositAmount(int i) {
		System.out.println("change to commit");
		
		return readBalance()+i;
	}

}
