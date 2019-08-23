public final class Car extends MotoVehicle {
    private String type;//型号

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String no, String type, String brand) {
        super.setNo(no);
        super.setBrand(brand);
        setType(type);
    }

    public int calRent(int days) {
        int money = 0;
        if (getType() == "别克商务车GL8") {
            money = 600 * days;
        } else if (getType() == "宝马550i") {
            money = 500 * days;
        } else if (getType() == "别克林荫大道") {
            money = 300 * days;
        }
        return money;
    }
}
