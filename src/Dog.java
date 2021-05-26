public class Dog extends Animal{
    public Dog(double weight, double height, String color) {
        super(weight, height, color);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + this.getWeight() +
                ", height=" + this.getHeight() +
                ", color='" + this.getColor() + '\'' +
                '}';
    }
}
