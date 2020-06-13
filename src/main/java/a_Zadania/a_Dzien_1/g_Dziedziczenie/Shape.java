package a_Zadania.a_Dzien_1.g_Dziedziczenie;


public class Shape {
    private String x, y;
    private String color;

    // this is a constructor
    public Shape(String x, String y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // this is a metod
    public String getDescription(String x, String y, String color) {

        return x + y + color;

    }

    // this is a metod
    public double getDistance(Shape shape) {

        return 2.0;
    }
}

