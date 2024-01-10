// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    class Rectangle {
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

        private double width;
        private double length;
        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }
        public Rectangle() {};
        public double getArea() {
            return (width * length);
        }
        public double getPerimeter() {
            return (width + length) * 2;
        }

    }

    class Square extends Rectangle {
        public Square(double side) {
           super(side, side);
        };
    }
    public static void main(String[] args) {

    }
}