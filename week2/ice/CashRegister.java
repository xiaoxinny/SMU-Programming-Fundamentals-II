public class CashRegister {
    private int purchase;
    private int payment;

    public CashRegister() {
        this.purchase = 0;
        this.payment = 0;
    }

    public void registerPurchase(double amount) {
        this.purchase += (int) (amount*100);
    }

    public void makePayment(int dollars, int cents) {
        this.payment += (dollars*100 + cents);
    }

    public double getPurchaseAmt() {
        return ((double)this.purchase)/100;
    }

    public double giveChange() {
        return ((double)(payment-purchase))/100;
    }

}
