
public class Main {
    public static void main(String[] args) {
        //shape
        Shape sh1  = new Shape("blue" , true);
        sh1.setFilled(false);
        sh1.setColor("red");
        System.out.println(sh1.toString());

        //circle
        Circle c1 = new Circle(4,"white",true);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.toString());


        //Rectangle
        Rectangle r1 = new Rectangle(3,3,"grey",true);
        System.out.println(r1.toString());


        //Square
        Square s1 = new Square(5);
//      s1.setSide(3);
        s1.setColor("purple");
        s1.setFilled(true);
        System.out.println(s1.toString());
        System.out.println(s1.getPerimeter());

    }
}