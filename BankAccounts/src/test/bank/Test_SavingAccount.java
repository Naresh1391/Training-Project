package test.bank;




import org.junit.Test;

import junit.framework.Assert;
import test.servlet.SavingObject;

public class Test_SavingAccount {
	
	@SuppressWarnings("unused")
	@Test
	public void chckSavingAccountAvailable(){
		SavingObject obj =  new SavingObject();
		
		/*if(obj == null){
			throw new RuntimeException( "The Account does Not Exists");
		}*/
		Assert.assertNotNull(obj);
		
	}
	
	@Test
	public void checkInitialBalance(){
		SavingObject obj = new SavingObject();
		int amount = obj.readBalance();
		/*if(amount != 1000)
			throw new RuntimeException("Initial Account Balance is less than 1000");*/
		Assert.assertEquals(1000, amount);
		
	}
	
	@Test
	public void testAccountDeposit(){
		SavingObject obj = new SavingObject();
		int amount = obj.depositAmount(1200);
		Assert.assertEquals(2200, amount);
	}

}
