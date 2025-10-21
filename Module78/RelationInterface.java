

package Module78;

//interface

interface Relation {
    
    public boolean isGreater( Object a, Object b);
    public boolean isLess( Object a, Object b);
    public boolean isEqual( Object a, Object b);

}

class Line implements Relation {
    private double length;
    
    public Line (double length){
        this.length = length;
    }
    
    public double getLength(){
        return length;
    }
    
    @Override 
    public boolean isGreater( Object a, Object b){
        return ((Line)a).getLength() > ((Line)b).getLength();
    
    }
    
    @Override 
    public boolean isLess( Object a, Object b){
         return ((Line)a).getLength() < ((Line)b).getLength();
    }
    
    @Override 
    public boolean isEqual( Object a, Object b){
         return ((Line)a).getLength() == ((Line)b).getLength();
    
    }
    
    
}
