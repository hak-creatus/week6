public class Rectangle extends Shape{
    int width, length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    void draw() {
        System.out.println("Draw rectangle");
    }

    @Override
    public double findArea() {
        return width * length;
    }
}
