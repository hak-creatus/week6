public class Circle extends Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Draw circle");
    }
}
