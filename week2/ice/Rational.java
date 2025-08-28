
public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        this.numerator = 1;
        this.denominator = 1;
    }

    public Rational(int n, int d) {
        this.numerator = n;
        this.denominator = d;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Rational add(Rational otherRational) {
        int newNumerator = this.numerator * otherRational.denominator + otherRational.numerator * this.denominator;
        int newDenominator = this.denominator * otherRational.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational subtract(Rational otherRational) {
        int newNumerator = this.numerator * otherRational.denominator - otherRational.numerator * this.denominator;
        int newDenominator = this.denominator * otherRational.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational multiply(Rational otherRational) {
        int newNumerator = this.numerator * otherRational.numerator;
        int newDenominator = this.denominator * otherRational.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational divide(Rational otherRational) {
        int newNumerator = this.numerator * otherRational.denominator;
        int newDenominator = this.denominator * otherRational.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
    
}