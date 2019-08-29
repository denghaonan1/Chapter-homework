public class Penguin extends Pet implements Eatable,Swimmable{
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public Penguin(String name,String sex){
        super(name);
        this.sex=sex;
    }
    public void print(){
        super.print();
        System.out.println("性别是"+this.sex);
    }
    public void eat(){
        super.setHealth(super.getHealth()+5);
        System.out.println("企鹅"+super.getName()+"吃饱啦健康值+5");
    }
    public void swimming(){
        super.setHealth(getHealth()-10);
        super.setLove(getLove()+5);
        System.out.println("企鹅"+super.getName()+"正在和主人游泳" +
                "健康值-10，亲密度+5");
    }
}
