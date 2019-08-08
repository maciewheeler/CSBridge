public class Vector {

    double x;
    double y;
    double z;

    Vector () {

        this.x = this.y = this.z = 0.0;
    }

    public Vector (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector add(final Vector v){
        Vector result = new Vector(this.x + v.x, this.y + v.y, this.z + v.z);
        return result;
    }

    public Vector sub(final Vector v){
        Vector result = new Vector(this.x - v.x, this.y - v.y, this.z - v.z);
        return result;
    }

    public Vector multC(final double v){
        Vector result = new Vector(this.x * v, this.y * v, this.z * v);
        return result;
    }

    public Vector mult(final Vector v){
        Vector result = new Vector(this.x * v.x, this.y * v.y, this.z * v.z);
        return result;
    }

    public Vector norm(){
        double v = (Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z));
        if (v < 0) {
            v = v * -1;
        }
        Vector result = new Vector(this.x / v, this.y / v, this.z / v);
        return result;
    }

    public double dot(final Vector v){
        return (this.x * v.x + this.y * v.y + this.z * v.z);
    }

}
