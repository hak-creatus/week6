public class AbstrictDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Rectangle r1 = new Rectangle(10,4);
        Circle c2 = new Circle(100);
        Cuboid cu1 = new Cuboid(10,20,30);

        cu1.draw();
        System.out.println(cu1.findVolume());
        System.out.println(c1.findArea());
        System.out.println(r1.findArea());
        System.out.println(c2.findArea());
    }
}
