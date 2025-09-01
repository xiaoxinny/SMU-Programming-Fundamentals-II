package exercise1;

public class DigitalCamera extends ElectronicProduct {
    private int digitalZoom;
    private int opticalZoom;
    private int resolution;

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
}
