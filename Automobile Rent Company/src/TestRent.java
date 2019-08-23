public class TestRent {
    public static void main(String[] args) {
        int totalRent=0;
        int days=5;
        MotoVehicle motos[] = {new Car("京NY28588", "宝马550i", "宝马")
                , new Car("京NN3284", "宝马550i", "宝马"), new Car("京NT43765", "别克林荫大道", "别克")
                , new Bus(34, "金龙", "京5643765"), new Truck(22, "解放", "京GD56577")};
        Custemer c=new Custemer("沈伟");
        totalRent = c.calcTotalRent(motos,days);
        System.out.println("汽车牌号"+"\t"+"汽车品牌");
        for (int i=0;i<motos.length;i++){
            System.out.println(motos[i].getNo()+"\t"+motos[i].getBrand());
        }
        System.out.println("客户"+c.getName()+",租凭天数"+days+",租凭总费用"+totalRent);
    }
}
