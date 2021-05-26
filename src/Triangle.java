public class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Nối 3 đường thẳng thành hình tam giác");
    }
}
