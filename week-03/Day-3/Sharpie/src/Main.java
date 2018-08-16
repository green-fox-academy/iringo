public class Main {

    public static void main(String[] args) {

        Sharpie pencil1 = new Sharpie("red", 431);
        System.out.println(pencil1.use(30));

        Sharpie pencil2 = new Sharpie("blue", 32);
        System.out.println(pencil2.inkAmount);

    }
}
