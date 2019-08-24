public class Master {
    private String name = "";
    private int money = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public Master(String name,int money){
        this.name=name;
        this.money=money;
    }
    public void feed(Pet pet){
        pet.eat();
    }
    public Pet getpet(int typeId){
        Pet pet=null;
        if (typeId==1){
            pet = new Dog("旺财","哈士奇");
        }else{
            pet=new Penguin("QQ","雌");
        }
        return pet;
    }
    public void play(Pet pet){
        if (pet instanceof Dog){
             ((Dog) pet).catchingFlyDisc();
        }
        if (pet instanceof Penguin){
            ((Penguin) pet).swimming();
        }
    }
}
