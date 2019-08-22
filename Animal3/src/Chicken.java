public final class Chicken extends Animal{
    public Chicken(String name,String type,String food){
        super.setName(name);
        super.setFood(food);
        super.setType(type);
    }
    public  void pring(){
        System.out.println("我叫"+super.getName()+",是一只"+super.getType()+"鸡");
    }
    public  void eat(){
        System.out.println("我喜欢吃"+super.getFood());
    }
    public  void action(){
        System.out.println("我会打鸣");
    }
}
