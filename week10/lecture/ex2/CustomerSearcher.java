import java.util.*;
import javax.crypto.CipherInputStream;
public class CustomerSearcher{
	
	//  Implement missing methods here
	private static Customer findPurchasedTheMostItems(ArrayList<Customer> custList) {
		int max = 0;
		Customer highest_cust = null;
		for (Customer c: custList) {
			if(c.getItemsPurchased() > max) {
				max = c.getItemsPurchased();
				highest_cust = c;
			}
		}

		return highest_cust;
	}
	
	private static Customer findOldest(ArrayList<Customer> custList) {
		int max = 9999;
		Customer oldest_cust = null;
		for (Customer c: custList) {
			if (c.getYearJoined() < max) {
				max = c.getYearJoined();
				oldest_cust = c;
			}
		}

		return oldest_cust;
	}

	private static Customer findSpentTheMostDollars(ArrayList<Customer> custList) {
		double max = 0;
		Customer highest_cust = null;
		for (Customer c: custList) {
			if (c.getDollarsSpent() > max) {
				max = c.getDollarsSpent();
				highest_cust = c;
			}
		}

		return highest_cust;
	}

	private static void removeFirstCustomerWithName(ArrayList<Customer> custList, String name) {
		Iterator<Customer> iter = custList.iterator();
		while(iter.hasNext()) {
			Customer c = iter.next();
			if (c.getName().equals(name)) {
				iter.remove();
				break;
			}
		}
	}

	// ********************************

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Customer c1 = new Customer("andy",10,2005,2000);
		Customer c2 = new Customer("bob",12,2005,1000);
		Customer c3 = new Customer("ruth",10,1987,1900);
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		
		System.out.println("\r\nThe customer who purchased the most items is: ");
		System.out.println(CustomerSearcher.findPurchasedTheMostItems(customers));
		
		System.out.println("\r\nThe oldest customer is: ");
		System.out.println(CustomerSearcher.findOldest(customers));
		
		System.out.println("\r\nThe customer who spent the most dollars is: ");
		System.out.println(CustomerSearcher.findSpentTheMostDollars(customers));
		
		System.out.println("\r\nDeleting \"Ruth\" ...");
		CustomerSearcher.removeFirstCustomerWithName(customers,"ruth");
		
		System.out.println("The remaining customers (after the deletion) are:");
		for(Customer c:customers) {
			System.out.println(c);
		}
	}
}