public abstract class MotoVehicle {
    private String no;//车牌
    private String brand;//品牌

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public MotoVehicle() {

    }

    public abstract int calRent(int days);
}
