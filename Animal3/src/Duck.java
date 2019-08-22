public final class Duck extends Animal{
    public Duck(String name,String type,String food){
        super.setFood(food);
        super.setName(name);
        super.setType(type);
    }
    public  void pring(){
        System.out.println("我叫"+super.getName()+",是一只"+super.getType()+"鸭");
    }
    public  void eat(){
        System.out.println("我喜欢吃"+super.getFood());
    }
    public  void action(){
        System.out.println("我会游泳");
    }
}
