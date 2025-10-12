package JavaTraining.src.Interface;

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
        hs.b();
        hs.c();
        hs.callingInterfaceDefaultMethod(); //Calls interface default method
		
		System.out.println("-------------US BANK ------------------");
        USBank us = new HSBCBank();
		us.credit();
		us.debit();
		us.transferMoney();
        us.b();  //calls overridden default method
        USBank.a(); //static method
        USBank.nestedInterface.d(); //nested interface
		//us.educationLoan(); --> can not access
		//us.carLoan(); --> can not access
		
		int a = USBank.min_bal;		
		// USBank.min_bal = 20;  --> we can not change interface var. value bcoz it is final in nature
		System.out.println(a);

        System.out.println("-------------Brazil BANK ------------------");
		BrazilBank b = new HSBCBank();
		b.mutualFund();
		b.credit();
		b.capital();
		b.interestRate();
	}

}
