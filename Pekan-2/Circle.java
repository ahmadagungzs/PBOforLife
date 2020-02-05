package Rabu5Feb2020;

public class Circle {
    public double radius;
    public String color;
    public double area;
    public static final double Pi = 3.14;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Pi * this.radius * this.radius;
    }

    public void PrintData() {
        System.out.println("Lingkaran satu = " + getRadius() + getColor() + getArea());
        System.out.println("Lingkaran dua = " + getRadius() + getColor() + getArea());
        System.out.println("Lingkaran tiga = " + getRadius() + getColor() + getArea());
    }
}