import com.ibm.bank.AccountsFactory;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Bank;

public class TestAccounts {

	public static void main(String[] args) {
		
		Bank s1 = AccountsFactory.openSavings("Polo");
		
		try {
			s1.withdraw(1000);
		} catch (BalanceException e) {
//			e.printStackTrace();	// For developers, to troubleshoot the problem
//			System.out.println(e);	// For logging, to audit the behaviour of the application
			System.out.println(e.getMessage());	// For end users information
		}
		
	}
}
