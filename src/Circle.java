public class Circle extends Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Draw circle");
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
