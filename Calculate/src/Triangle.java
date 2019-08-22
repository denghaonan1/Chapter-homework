public final class Triangle extends TheGraphicsArea {
    private double theBottom;//下底
    private double tall;//高

    public double getTheBottom() {
        return theBottom;
    }

    public void setTheBottom(double theBottom) {
        this.theBottom = theBottom;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public double Area() {
        double area = getTall() * getTheBottom() / 2;
        System.out.println("三角形的面积是" + area);
        return area;
    }
}
