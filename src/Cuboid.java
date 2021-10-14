public class Cuboid extends Rectangle{
    int height;

    public Cuboid(int width, int length, int height) {
        super(width, length);
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Draw cuboid");
    }

    public double findVolume()
    {
        return  super.findArea()*height;
    }

}
