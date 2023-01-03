package day2bt.Pojo;

public class Student {
    private Circle circle;
    private Square square;
    private Rectangular rectangular;

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

    public void setRectangular(Rectangular rectangular) {
        this.rectangular = rectangular;
    }

    public void paintingCicle(String name, double radius) {
        circle.painting(name);
        System.out.print("Hình tròn có bán kính" + radius);

    }

    public void paintingSquare(String name, double cm) {
        square.painting(name);
        System.out.println("Hình vuông có chiều dài" + cm);

    }

    public void paintingRectangular(String name, double cm) {
        rectangular.painting(name);
        System.out.println("Hình vuông có chiều dài " + cm);
    }
}

