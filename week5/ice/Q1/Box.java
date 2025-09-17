public class Box {
    private int length;
    private int breadth;
    private int height;

    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Box clone() {
        return new Box(length, breadth, height);
    }

    @Override
    public boolean equals(Object anotherBox) {
        if (anotherBox instanceof Box) {
            Box box = (Box) anotherBox;
            return box.length == length &&
                    box.height == height &&
                    box.breadth == breadth;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("height: %d, breadth: %d, length: %d", height, breadth, length);
    }
}
