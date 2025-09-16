public class DigitalCamera extends ElectronicProduct{
    private int digitalZoom;
    private int opticalZoom;
    private int resolution;

    public DigitalCamera(String name, String company, int manufacturedYear, double price, int digitalZoom, int opticalZoom, int resolution) {
        super(name, company, manufacturedYear, price);
        this.digitalZoom = digitalZoom;
        this.opticalZoom = opticalZoom;
        this.resolution = resolution;
    }

    public int getDigitalZoom() {
        return digitalZoom;
    }
    public void setDigitalZoom(int digitalZoom) {
        this.digitalZoom = digitalZoom;
    }
    public int getOpticalZoom() {
        return opticalZoom;
    }
    public void setOpticalZoom(int opticalZoom) {
        this.opticalZoom = opticalZoom;
    }
    public int getResolution() {
        return resolution;
    }
    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
    @Override
    public String toString() {
        return "DigitalCamera[" + super.toString() + ",DigitalZoom=" + digitalZoom + ",OpticalZoom=" + opticalZoom + ",Resolution=" + resolution + "]";
    }
}
