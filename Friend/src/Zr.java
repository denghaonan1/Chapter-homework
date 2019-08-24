public class Zr {
    public void print(Friends f) {
        if (f instanceof Wang) {
            f = new Wang("王小强", "四川菜", "中国", "练太极拳");
            f.print();
            f.eat();
            f.movement();
        }
        if (f instanceof John) {
            f = new John("约翰", "披萨", "美国", "打橄榄球");
            f.print();
            f.eat();
            f.movement();
        }
    }
}
