/**
  * This class processes various transactions including debiting an account
  */
public class TransactionProcessor{
	/**
     * Compute the remainder balance after a debit is performed
     * @param balance The account balance
	 * @param amt The amount to be debited
     */
	public double debitAccount(double balance, double amt) throws Exception{
		// Task 1: Implement the code that would cause an exception to be raised if amt is a negative number
		// Task 2: Make this class compilable
		if (amt < 0) {
			throw new Exception("The amt cannot be negative");
		}
		return balance-amt;
	}
}