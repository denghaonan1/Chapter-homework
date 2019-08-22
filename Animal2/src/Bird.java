public final class Bird extends Animal{
    private String color;
    public Bird(int age,String color){
        super.setAge(age);
        setColor(color);
    }
    public void print(){
        System.out.println("我是一只"+getColor()+"色的鸟");
        System.out.println("今年"+super.getAge()+"岁了");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
