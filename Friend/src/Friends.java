public abstract class Friends {
    private String food;
    private String movement;
    private String name;
    private String state;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void print(Friends f);

    public abstract void eat(Friends f);

    public abstract void movement(Friends f);

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
