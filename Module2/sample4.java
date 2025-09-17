package Module2;
//give example of wrapper classes in java
public class sample4 {
    public static void main(String[] args) {
        int myInt = 10;
        double myDouble = 20.5;
        char myChar = 'A';
        boolean myBoolean = true;

        // Converting primitive types to wrapper classes
        Integer wrappedInt = Integer.valueOf(myInt);
        Double wrappedDouble = Double.valueOf(myDouble);
        Character wrappedChar = Character.valueOf(myChar);
        Boolean wrappedBoolean = Boolean.valueOf(myBoolean);

        // Displaying the values of wrapper classes
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Wrapped Character: " + wrappedChar);
        System.out.println("Wrapped Boolean: " + wrappedBoolean);

        // Converting wrapper classes back to primitive types
        int unwrappedInt = wrappedInt.intValue();
        double unwrappedDouble = wrappedDouble.doubleValue();
        char unwrappedChar = wrappedChar.charValue();
        boolean unwrappedBoolean = wrappedBoolean.booleanValue();

        // Displaying the values of unwrapped primitive types
        System.out.println("Unwrapped Integer: " + unwrappedInt);
        System.out.println("Unwrapped Double: " + unwrappedDouble);
        System.out.println("Unwrapped Character: " + unwrappedChar);
        System.out.println("Unwrapped Boolean: " + unwrappedBoolean);
    }
}
