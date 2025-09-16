public class Printer extends ElectronicProduct{
    private int printingSpeed;
    private boolean faxEnabled;
    private boolean scannerIncluded;

    public Printer(String name, String company, int manufacturedYear, double price, int printingSpeed, boolean faxEnabled, boolean scannerIncluded) {
        super(name, company, manufacturedYear, price);
        this.printingSpeed = printingSpeed;
        this.faxEnabled = faxEnabled;
        this.scannerIncluded = scannerIncluded;
    }
    
    public int getPrintingSpeed() {
        return printingSpeed;
    }
    public void setPrintingSpeed(int printingSpeed) {
        this.printingSpeed = printingSpeed;
    }
    public boolean isFaxEnabled() {
        return faxEnabled;
    }
    public void setFaxEnabled(boolean faxEnabled) {
        this.faxEnabled = faxEnabled;
    }
    public boolean isScannerIncluded() {
        return scannerIncluded;
    }
    public void setScannerIncluded(boolean scannerIncluded) {
        this.scannerIncluded = scannerIncluded;
    }
    @Override
    public String toString() {
        return "Printer[" + super.toString() + ",PrintingSpeed=" + printingSpeed + ",FaxEnabled=" + faxEnabled + ",ScannerIncluded=" + scannerIncluded + "]";
    }
}
