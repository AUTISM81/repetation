public class Rectangle {

    private float length;
    private float width;

    public Rectangle(double v, double v1) {
        length = (float) v;
        width = (float) v1;
    }

    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public float getLength() {
        return length;
    }

    public void setLength(int length1){
        length = length1;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(int width1) {
        width = width1;
    }

    public double getArea() {
        return width*length;
    }

    public double getPerimeter() {
        return (length*2)+(width*2);
    }

    public String toString() {
        return  "Rectangle[length=" + length + ",width=" + width + "]";
    }
}
