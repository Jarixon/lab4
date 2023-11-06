import java.util.Scanner;

public class Rectangle {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double calculateArea() {
        return width * length;
    }

    public double calculatePerimeter() {
        return 2 * (width + length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Introduceți lățimea dreptunghiului: ");
        double width = scanner.nextDouble();
        rectangle.setWidth(width);

        System.out.print("Introduceți lungimea dreptunghiului: ");
        double length = scanner.nextDouble();
        rectangle.setLength(length);

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("Aria dreptunghiului: " + area);
        System.out.println("Perimetrul dreptunghiului: " + perimeter);

        scanner.close();
    }
}
