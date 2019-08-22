public final class Trapezoid extends TheGraphicsArea{
    private double theBottom;//下底
    private double tall;//高
    private double upBottom;//上底

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

    public double getUpBottom() {
        return upBottom;
    }

    public void setUpBottom(double upBottom) {
        this.upBottom = upBottom;
    }
    public  double Area(){
        double area=(getTheBottom()+getUpBottom())*getTall()/2;
        System.out.println("梯形的面积是"+area);
        return area;
    }
}
