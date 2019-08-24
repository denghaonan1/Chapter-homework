public class Dog extends Pet{
    private String strain;

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
    public Dog(String name, String strain){
        super(name);
        this.strain=strain;
    }
    public void print(){
        super.print();
        System.out.println("我是一只"+this.strain);
    }
    public void eat(){
        super.setHealth(super.getHealth()+3);
        System.out.println("狗狗"+super.getName()+"吃饱了健康值+3");
    }
    public void catchingFlyDisc(){
        super.setHealth(getHealth()-10);
        super.setLove(getLove()+5);
        System.out.println("狗狗"+super.getName()+"正在和主人玩接飞盘游戏" +
                "健康值-10，亲密度+5");
    }
}
