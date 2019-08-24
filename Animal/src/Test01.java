import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Master m=new Master("王",100);
        System.out.println("欢迎来到宠物店!");
        System.out.println("请选择你要领养的宠物类型(1、狗狗 2、企鹅)");
        int typeId=in.nextInt();
        Pet pet=m.getpet(typeId);
        if (pet!=null){
            System.out.println("领养成功");
            m.feed(pet);
            m.play(pet);
        }
    }
}
