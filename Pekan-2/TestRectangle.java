package Rabu5Feb2020;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.0f, 3.0f);
        System.out.println("The length is " + rectangle.getLength());
        System.out.println("The width is "+ rectangle.getWidth());
        System.out.println(rectangle.toString());
        rectangle.setLength(10.0f);
        rectangle.setWidth(2.0f);
        System.out.println("Change length: " + rectangle.getLength());
        System.out.println("Change width: " + rectangle.getWidth());
        System.out.println(rectangle.toString());
    }
}