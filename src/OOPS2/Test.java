package OOPS2;



public class Test {

	public static void main(String[] args) {
		
		//dynamic polymorphism: we can only call overridden methods in interface.
		
		USBank bk=new HDFCBank();
		
		bk.credit();
		bk.debit();
		bk.transferfund();
		
		System.out.println(+USBank.min_amount);
		
		HDFCBank hdfcbank=new HDFCBank();
		
		hdfcbank.credit();
		hdfcbank.debit();
		hdfcbank.transferfund();
		System.out.println("************************************");
		hdfcbank.eduloan();
		hdfcbank.HomeLoan();
		hdfcbank.MutualFund();
		//BrazilBank Bbank = new BrazilBank(); interface cannot be instantiated
		

		
	}

}
