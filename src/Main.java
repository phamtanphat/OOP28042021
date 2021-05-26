import javax.swing.*;
import javax.swing.text.html.parser.Entity;

public class Main {
    public static void main(String[] args) throws Exception{

        // Tạo 1 object từ lớp đối tượng animal
        // new : toán tử khởi tạo cho vùng nhớ
//        Animal meo = new Animal();
        // constructor : điều kiện cần
//        meo.color = "Xám";
//        meo.height = 0.30;
//        meo.weight = 2.2;
//
//        System.out.println(meo.color);

//        Animal meo = new Animal(2.2,0.3,"Xám");
//        meo.setColor("Đen");
//
//        System.out.println(meo.getColor());

//        Dog milu = new Dog(4,0.6,"Đen");
//        System.out.println(milu.toString());

        // public
        // private
        // protected
        // default

        // overload
        showMessage(12345);
    }
    public static void showMessage(String message){
        System.out.println(message);
    }
    public static void showMessage(int resourceId){
        System.out.println(resourceId);
    }

    // Tính bao đóng : access modifier
    // Tính truou tượng
    // Tính kết thừa
    // Tính đa hình
}
