package Interface;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.capital();
		hs.interestRate();
		
		// Dynamic Polymorphism --> child class object can be referred by parent Interface reference variable
		// Only overridden methods will be called using dynamic polymorphism.
		USBank us = new HSBCBank();
		us.credit();
		us.debit();
		us.transferMoney();
		//us.educationLoan(); --> can not access
		//us.carLoan(); --> can not access
		
		int a = USBank.min_bal;		
		// USBank.min_bal = 20;  --> we can not change interface var. value bcoz it is final in nature
		System.out.println(a); 
		
		BrazilBank b = new HSBCBank();
		b.mutualFund();
		b.credit();
		b.capital();
		b.interestRate();
	}

}
