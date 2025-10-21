package Module78;


public class RelationInterfaceDemo {
    public static void main(String[] args) {
        //create object
        Line line1 = new Line(5);
        Line line2 = new Line(10);
        
        //comparison
        System.out.println("is line1 greater than line 2? "+line1.isGreater(line1, line2));
        
        System.out.println("is line1 less than line 2? "+line1.isLess(line1, line2));

        System.out.println("is line1 equal to line 2? "+line1.isEqual(line1, line2));
        
        
        
    }
}
