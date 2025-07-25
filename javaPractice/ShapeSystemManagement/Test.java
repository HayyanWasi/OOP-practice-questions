interface Drawable{
    void draw();
}
abstract class Shape implements Drawable{
    String color;

    Shape(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    abstract double calculateArea();
}

class Circle extends Shape{

    float radius;
    double area;


    
    Circle(String color, double radius){
        super(color);
        this.radius=(float) radius;
        
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(float radius){
        this.radius= radius;
    }


    @Override
    public void draw() {
        System.out.println("Drawing a Circle with color " + getColor());
    }

    @Override
    double calculateArea() {
        if(radius>0){
         area =Math.PI*radius*radius;
         System.out.println("area of circle is: "+area);
        }
        return area;
    }

}

class Rectangle extends Shape{
    double area;
    double length;
    double width;

    Rectangle(String color, double area){
        super(color);
        this.area=area;
    }

    public double length(){
        return length;
    }
    public double width(){
        return width;
    }

    public void getlength(double length){
        this.length=length;
    }
    public void getWidth(double width){
        this.width=width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a retangle with color " + getColor());
    }
    @Override
    double calculateArea() {
        if (length<0 || width <0){
        area = length*width;
    }
    return area;

    }
}



class Test{
    public static void main(String[] args) {

        Shape circle = new Circle("red", 20);
        circle.calculateArea();
        circle.draw();

        
    }
}