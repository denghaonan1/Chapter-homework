public class Zr {
    public void print(Wang w,John j) {
        if (w instanceof Friends) {
            w = new Wang("王小强", "四川菜", "中国", "练太极拳");
            w.print(w);
            w.eat(w);
            w.movement(w);
        }
        if (j instanceof Friends) {
            j = new John("约翰", "披萨", "美国", "打橄榄球");
            j.print(j);
            j.eat(j);
            j.movement(j);
        }
    }
}
