public class Fish extends Animal{
    private double jin;

    public double getJin() {
        return jin;
    }

    public void setJin(double jin) {
        this.jin = jin;
    }
    public Fish(int age,double jin){
        super.setAge(age);
        setJin(jin);
    }
    public void print(){
        System.out.println("我是一只"+getJin()+"斤重的鱼");
        System.out.println("我今年"+super.getAge()+"岁了");
    }
}
