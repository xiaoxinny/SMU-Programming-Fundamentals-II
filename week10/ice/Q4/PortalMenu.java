import java.util.*;

public class PortalMenu {
	private PortalController pctrl;

    // constructor
	public PortalMenu(PortalController pctrl) {
		this.pctrl = pctrl;
	}

	// gets account to, account from and amount to transfer from user input and perform transfer
    public void processTransfer(String fromAccNum, String toAccNum, int amount){
		boolean status = pctrl.transfer(fromAccNum, toAccNum, amount);
		if (status) {
			System.out.println(String.format("%d has been transferred from %s to %s", amount, fromAccNum, toAccNum));
		} else {
			System.out.println(String.format("%s has insuffcient funds for transfer", fromAccNum));
		}
    }        
}