public class Triangle {

    double a;
    double b;
    double c;

    public void area() {
        double semiperimeter = (a + b + c) / 2;
        double square = Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
        System.out.println("S = "+square);
    }
}
