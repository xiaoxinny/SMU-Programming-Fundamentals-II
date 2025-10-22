// controller class containing the logic for bank transfer
public class PortalController {
	private Bank bank; // store all accounts in the bank
	// constructor

    public PortalController() {
        bank = new Bank();
    }


    // Write your answer below.
    public boolean transfer(String fromAccNum, String toAccNum, int amount) {
        Account fromAcc = bank.retrieveAccount(fromAccNum);
        Account toAcc = bank.retrieveAccount(toAccNum);
        double fromAccBalance = fromAcc.getBalance();
        if (fromAccBalance > amount) {
            fromAcc.deduct(amount);
            toAcc.add(amount);
            return true;
        }
        return false;
    }
}