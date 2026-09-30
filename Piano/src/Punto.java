public class Punto {

    private float x;
    private float y;

    public Punto() {
        x = 0;
        y = 0;
    }

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void stampaPunto() {
        System.out.println("Punto: (" + x + ", " + y + ")");
    }
}