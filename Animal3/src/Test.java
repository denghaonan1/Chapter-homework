public class Test {
    public static void main(String[] args) {
        Animal c = new Chicken("闲鱼", "芦花", "虫子");
        c.pring();
        c.eat();
        c.action();
        c = new Duck("咸鱼", "唐老", "小鱼虾");
        c.pring();
        c.eat();
        c.action();
    }
}
