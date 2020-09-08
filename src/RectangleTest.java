public class RectangleTest {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(2.0, 5.0);


        System.out.println("Length:" + r.getLength());
        System.out.println("width:" + r.getWidth());
        System.out.println("area:" + r.getArea());
        System.out.println("Perimeter" + r.getPerimeter());

        System.out.println("Sets length and width to 6 and 4");
        r.setLength(6);
        r.setWidth(4);

        System.out.println("Length:" + r.getLength());
        System.out.println("width:" + r.getWidth());
        System.out.println("area:" + r.getArea());
        System.out.println("Perimeter" + r.getPerimeter());
    }
}
