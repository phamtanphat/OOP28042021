public class Circle extends Shape{
    public Circle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Dùng một điểm để vẽ hình tròn");
    }
}
