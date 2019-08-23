import org.junit.Test;

public class Test01 {
    @Test
   public void test01() {
        Printer p[] = {new DotMatrixPrinter(), new InkpetPrinter(), new LaserPrinter()};

        DotMatrixPrinter d = (DotMatrixPrinter) p[0];
        d.print();

        InkpetPrinter I = (InkpetPrinter) p[1];
        I.print();

        LaserPrinter L = (LaserPrinter) p[2];
        L.print();
    }
}
