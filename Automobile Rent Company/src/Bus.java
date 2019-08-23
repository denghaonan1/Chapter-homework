public final class Bus extends MotoVehicle {
    private int seatCout;//座位数

    public int getSeatCout() {

        return seatCout;
    }

    public void setSeatCout(int seatCout) {
        this.seatCout = seatCout;
    }

    public Bus(int seatCout, String brand, String no) {
        super.setNo(no);
        super.setBrand(brand);
        setSeatCout(seatCout);
    }

    public int calRent(int days) {
        int money = 0;
        if (getSeatCout() <= 16) {
            money = 800 * days;
        } else if (getSeatCout() > 16) {
            money = 1500 * days;
        }
        return money;
    }
}
