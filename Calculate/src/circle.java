public final class circle extends TheGraphicsArea {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double Area() {
        double area = 3.14 * getR() * getR();
        System.out.println("圆形的面积是" + area);
        return area;
    }
}