//add contact
//View
//remove
//search
package TN28_Module9;
import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    private String name;
    private String phone;
                    //  hadji    123
    public Contact (String name, String phone) {
        this.name = name;  //hadji
        this.phone = phone; //123
        
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    @Override
    public String toString(){
        return "Contact[Name: "+name+ ", Phone "+phone+"]";
    }
    
}


public class ContactManagerArrayList {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\nContact Manager (ArrayList");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Remove Contact");
            System.out.println("4. Search Contact");
            System.out.println("5. Exit ");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter contact Phone Number: ");
                    String phone = scanner.nextLine();
                    contacts.add(new Contact (name,phone));
                    System.out.println("Contact added ");
                    break;
                case 2:
                    System.out.println("List of Contacts ");
                    for (Contact contact : contacts ){
                        System.out.println(contact);
                    }
                    break;
                case 3:
                    System.out.print("Enter name to remove ");
                    String nameToRemove = scanner.nextLine();
                    boolean removed = contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(nameToRemove));
                    if (removed){
                        System.out.println("Contact Removed ");
                    }else{
                        System.out.println("Contact not found ");
                    }
                    break;
                case 4:
                    System.out.print("Enter name to search ");
                    String nameToSearch = scanner.nextLine();
                    boolean found = false;
                    for (Contact contact : contacts ){
                        if (contact.getName().equalsIgnoreCase(nameToSearch)){
                            System.out.println("Found "+contact);
                            found = true;
                            break;
                        }
                    
                    }
                    if (!found){
                        System.out.println("Contact not found ");
                    }
                    
                    break;
                    
                case 5:
                    System.out.println("Exit Program");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        
        }

        
    }
}



