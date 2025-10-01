
public class PartAndQuantityEntry {

    public void enterPartAndQuantity(int partNum, int quantity) {
        if (partNum >= 0 && partNum <= 999 && quantity >= 1 && quantity <= 5000) {
            System.out.println("Successfully inserted order."); 
        } else {
            throw new IllegalArgumentException("Invalid order, part number should be between 0 and 999, quantity ordered between 1 and 5000");
        }
    }
}
