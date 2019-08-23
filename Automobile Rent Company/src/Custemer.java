public class Custemer {
    private String name;

    public int calcTotalRent(MotoVehicle motos[], int days) {
        int sum = 0;
        for (int i = 0; i < motos.length; i++) {
            sum += motos[i].calRent(days);
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Custemer(String name) {
        setName(name);
    }
}
