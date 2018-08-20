import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sharpie sharpie1 = new Sharpie("blue", 10);
        Sharpie sharpie2 = new Sharpie("red", 20);
        Sharpie sharpie3 = new Sharpie("yellow", 30);
        sharpie1.use(4);
        sharpie2.use(5);
        sharpie3.use(120);

        SharpieSet sharpieSet1 = new SharpieSet(sharpie1);
        SharpieSet sharpieSet2 = new SharpieSet(sharpie2);
        SharpieSet sharpieSet3 = new SharpieSet(sharpie3);

        System.out.println(sharpieSet3.countUsable());
    }

}
