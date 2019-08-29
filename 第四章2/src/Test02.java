import org.junit.Test;

public class Test02 {
    @Test
    public void te(){
        Pet p=new Dog("旺财","哈士奇");
        p.print();
        Dog dog=(Dog)p;
        dog.eat();
        dog.catchingFlyDisc();
        p=new Penguin("QQ","雄");
        Penguin pgn=(Penguin)p;
        p.print();
        pgn.eat();
        pgn.swimming();
    }
}
