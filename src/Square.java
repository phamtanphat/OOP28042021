public class Square extends Shape{
    public Square(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("Nối 4 đường thằng thành hình vuông");
    }
}
