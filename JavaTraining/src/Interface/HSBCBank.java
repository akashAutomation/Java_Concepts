package Interface;

public class HSBCBank implements USBank, BrazilBank {  // Is-a Relationship --> Interface and class relationship
	
	/*
	 * 1. If a class is implementing any Interface then its mandatory to define/override all the methods of Interface.
	 * ex-> here we are implementing USBank interface so we have to define/override all the methods of USBank
	 * 
	 * 2. We are achieving multiple inheritance by using interface 
	 * 3. Class can implements none, one or more interfaces as well as extend any one class
	 *    ex-> public class HSBCBank extends TestBank implements USBank, BrazilBank
	 */
	
	
	@Override
	public void credit() { // overridden method from USBank
		System.out.println("hsbc --> credit");
	}
	
	@Override
	public void debit() { // overridden method from USBank
		System.out.println("hsbc --> debit");
	}

	public void transferMoney() { //overridden method from USBank
		System.out.println("hsbc --> transferMoney");
	}

	public void educationLoan() { //seperate methods of HSBCBank class
		System.out.println("hsbc --> educationLoan");
	}
	
	public void carLoan() { //seperate methods of HSBCBank class
		System.out.println("hsbc --> carLoan");
	}

	@Override
	public void mutualFund() { // overridden method from BrazilBank
		System.out.println("hsbc --> mutualFund");		
	}

	@Override
	public void interestRate() {
		System.out.println("hsbc --> interestRate");
		
	}

	@Override
	public void capital() {
		System.out.println("hsbc --> capital");
		
	}
}
