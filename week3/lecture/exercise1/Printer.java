package exercise1;

public class Printer extends ElectronicProduct {
    private int printingSpeed;
    private boolean faxEnabled;
    private boolean scannerIncluded;
    
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
}
