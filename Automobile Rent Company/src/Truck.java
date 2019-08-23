public final class Truck extends MotoVehicle {
    private int tonnage;

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public Truck(int tonnage, String brand, String no) {
        super.setNo(no);
        super.setBrand(brand);
        setTonnage(tonnage);
    }

    public int calRent(int days) {

        return getTonnage() * days * 50;
    }
}
