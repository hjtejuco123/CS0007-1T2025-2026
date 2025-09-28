//give examples of all access modifiers
//private, public, protected, default

package Module5;

public class AccessModifiers {
    // Private access modifier
    private String privateField = "Private Field";

    // Public access modifier
    public String publicField = "Public Field";

    // Protected access modifier
    protected String protectedField = "Protected Field";

    // Default access modifier (no modifier)
    String defaultField = "Default Field";

    public void displayFields() {
        System.out.println(privateField);
        System.out.println(publicField);
        System.out.println(protectedField);
        System.out.println(defaultField);
    }
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.displayFields();
    }
}
