
package Module6;

public class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle (String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }
    
    public void calculateArea(){
        double area = length * width;
        System.out.println("Area of Circle is:  "+area);
        
    }
    
    
}
