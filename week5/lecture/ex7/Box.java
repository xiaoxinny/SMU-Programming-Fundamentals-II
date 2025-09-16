public class Box{
	private double length;
	private double breadth;
	private double height;

	//Implement Here
	public Box(double length, double breadth, double height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	@Override
	public boolean equals(Object typObject) {
		return typObject instanceof Box;
	}

	@Override
	public String toString() {
		return String.format("Length=%.1f,Breadth=%.1f,Height=%.1f", this.length, this.breadth, this.height);
	}

}