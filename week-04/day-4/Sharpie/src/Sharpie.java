public class Sharpie {

    private String color;
    private float width;
    private float inkAmount;

    Sharpie(String color,  float width) {
        this.color = color;
        this.width = width;
        inkAmount = 100;
    }

    public float use(float number) {
        this.inkAmount = inkAmount - number;
        return inkAmount;
    }

}