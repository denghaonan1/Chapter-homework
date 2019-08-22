import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("请选择要计算面积的图形(1、圆 2、梯形 3、三角形)");
        int num=in.nextInt();
        switch (num){
            case 1:
                System.out.println("请输入圆的半径");
                double r=in.nextDouble();
                circle c=new circle();
                c.setR(r);
                c.Area();
                break;
            case 2:
                System.out.println("请输入梯形的上底下底和高");
                double upBottom=in.nextDouble();
                double theBottom=in.nextDouble();
                double tall=in.nextDouble();
                Trapezoid t=new Trapezoid();
                t.setTall(tall);
                t.setTheBottom(theBottom);
                t.setUpBottom(upBottom);
                t.Area();
                break;
            case 3:
                System.out.println("请输入三角形的底和高");
                double theBottom2=in.nextDouble();
                double tall2=in.nextDouble();
                Triangle s=new Triangle();
                s.setTall(tall2);
                s.setTheBottom(theBottom2);
                s.Area();
                break;
        }
    }
}
