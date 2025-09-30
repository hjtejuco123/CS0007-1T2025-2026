
package Module6;


class Circle extends Shape {
    
    private double radius;
    
    public Circle (String color, double radius) {
        super(color);
        this.radius = radius;
    
    }
    
    public void calculateArea(){
        double area = Math.PI* radius * radius;
        System.out.println("Area of Circle is:  "+area);
        
    }
    
    
}
