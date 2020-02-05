package Rabu5Feb2020;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double perimeter() { return (2*width) + (2*length);}

    @Override
    public String toString() {
        return "Rabu5Feb2020.Rectangle [length = " + length + ", width = " + width + ']' + " is area : " + getArea() + "\n" +
                "Rabu5Feb2020.Rectangle [length = " + length + ", width = " + width + ']' + " is perimeter : " + perimeter();
    }
}