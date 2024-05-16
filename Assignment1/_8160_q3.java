class Point {
    private double a;
    private double b;

    public Point(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Point(Point point) {
        this.a = point.getA();
        this.b = point.getB();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
public class _8160_q3 {

	public static void main(String[] args) {
		 Point point1 = new Point(9.0, 7.0);
	     System.out.println("Initial values - A: " + point1.getA() + ", B: " + point1.getB());

	     Point point2 = new Point(point1);

	     point1.setX(2.0);
	     point1.setY(7.0);
	     
	     System.out.println("Changed values for point1 - B: " + point1.getA() + ", B: " + point1.getB());

	     System.out.println("Values for point2 (copy) - A: " + point2.getA() + ", B: " + point2.getB());
	}

}
