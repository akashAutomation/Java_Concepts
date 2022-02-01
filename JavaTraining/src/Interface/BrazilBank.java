package Interface;

 //Multiple extension is allowed when extending Interfaces i.e. one interface can extend none, one or more interfaces.
 // ex-> BrazilBank is extends BankOfSpain and WorldBank Interfaces

public interface BrazilBank extends BankOfSpain, WorldBank{

	public void mutualFund();
	
	public void credit();
}
