public class Circle extends Shape {
    private double radius =1.0;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        //***
        return (3.14159)*Math.pow(radius,2);
    }

    public double getPerimeter(){
        return 2*(3.14159)*radius;
    }

    public String toString(){

        return "Color of the shape: "+getColor()+", is it filled? "+isFilled()+", area of the circle = "+getArea()+" and perimeter = "+getPerimeter();
    }
}
