import org.junit.Test;

public class Test01 {
    @Test
    public void te(){
        Animal a=Store.get("dog");
        a.shout();
        a=Store.get("pig");
        a.shout();
        a=Store.get("cat");
        a.shout();
    }
}
