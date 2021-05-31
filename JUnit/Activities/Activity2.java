package activities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Activity2 {

	@Test
	void notEnoughFunds() {
	    BankAccount b1 = new BankAccount(9);
	    assertThrows(NotEnoughFundsException.class, ()-> b1.withdraw(10));
	    System.out.println("Not enough fund throwing the exception is verified");
	}
	
	@Test
	void enoughFunds() {
		   BankAccount b1 = new BankAccount(100);

		    // Assertion for exception
		       assertDoesNotThrow(()->b1.withdraw(100));
			    System.out.println("Enough fund not throwing the exception is verified");
		    
	}

}
