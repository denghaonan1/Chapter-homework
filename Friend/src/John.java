public final class John extends Friends {
    public John() {

    }

    public John(String name, String food, String state, String movement) {
        super.setFood(food);
        super.setMovement(movement);
        super.setName(name);
        super.setState(state);
    }

    public void print(Friends f) {
        System.out.println("我叫" + super.getName() + "我来自" + getState());
    }

    public void eat(Friends f) {
        System.out.println("我喜欢吃" + getFood());
    }

    public void movement(Friends f) {
        System.out.println("我喜欢" + getMovement());
    }
}
