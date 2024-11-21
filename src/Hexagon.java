public class Hexagon extends Shape{

    private double base;
    private double height;

    public Hexagon(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (base + height);
    }
}
