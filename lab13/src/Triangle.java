public class Triangle {

    private double base;

    public Triangle(double base) {
        this.base = base;
    }

    public double getPerimeter () {
        return this.base * 3;
    }

    public double getArea () {
        return Math.sqrt(3) * this.base * this.base/4;
    }

}