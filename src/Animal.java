public class Animal {
    // Thuộc tính
    private double weight;
    private double height;
    private String color;

    // Phương thức
    // constructor


    public Animal(double weight, double height, String color) {
        this.weight = weight;
        this.height = height;
        this.color = color;
    }

    // getter và setter
    public void setColor(String color){
        if (color.length() <= 0){
            throw new NullPointerException("Giá trị rỗng");
        }
        this.color = color;
    }

    public String getColor(){
        return color;
    }
    // alt + insert

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
