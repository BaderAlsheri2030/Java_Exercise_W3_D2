public class Square extends Rectangle{
    public Square(){

    }
    public Square(double side){
    super.setWidth(side);
    super.setLength(side);
    }

    public Square(double width, double length,String color, boolean filled) {
        super(width, length, color, filled);
    }

    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public String toString(){
        return "Color of the shape: "+getColor()+", is it filled? "+isFilled()+", area of the Square = "+getArea()+" and perimeter = "+getPerimeter();

    }
}
