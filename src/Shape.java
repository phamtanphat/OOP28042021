public abstract class Shape {
    String name;

    public Shape(String name){
        this.name = name;
    }
    // phuong thức trườu tượng
    public abstract void draw();

    public void printShape(){
        System.out.println(this.name);
    }
}
