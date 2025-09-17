public class Octagon implements Shape {
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2) * (2 + 2 * (Math.sqrt(2)));
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public String toString() {
        return String.format("sides: %.2f, area: %.2f, perimeter: %.2f", getSide(), getArea(), getPerimeter());
    }
}
