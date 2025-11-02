
package TN28_Module9;


import java.util.LinkedList;
import java.util.Scanner;

class Contact {
    private String name;
    private String phone;

    public Contact (String name, String phone) {
        this.name = name;
        this.phone = phone;
        
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

public class ContactManagerLinkedList {
    public static void main(String[] args) {
        LinkedList<Contact> contacts = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
        
            System.out.println("\nContact Manager (LinkedList)");
            System.out.println("1. Add Contact at beginning ");
            System.out.println("2. Add Contact at end ");
            System.out.println("3. Remove First contact ");
            System.out.println("4. Remove last contact ");
            System.out.println("5. View ");
            System.out.println("6. Add Contact at specific position ");
            System.out.println("7. Remove Contact by name");
            System.out.println("8. Remove by Position: ");
            System.out.println("9. Search by name ");
            System.out.println("10. Exit ");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter contact name: ");
                    String nameFirst = scanner.nextLine();
                    System.out.print("Enter contact Phone Number: ");
                    String phoneFirst = scanner.nextLine();
                    contacts.addFirst(new Contact (nameFirst,phoneFirst));
                    System.out.println("Contact added at the beginning.");
                    break;
                case 2:
                    System.out.print("Enter contact name: ");
                    String nameLast = scanner.nextLine();
                    System.out.print("Enter contact Phone Number: ");
                    String phoneLast = scanner.nextLine();
                    contacts.addLast(new Contact (nameLast,phoneLast));
                    System.out.println("Contact added at the end.");
                    break;
                case 3:
                    if (!contacts.isEmpty()){
                        Contact removedFirst = contacts.removeFirst();
                        System.out.println("Remove First contact "+removedFirst);
                    }else{
                        System.out.println("No contact to remove ");
                    
                    }
                    break;
                case 4:
                    if (!contacts.isEmpty()){
                        Contact removedLast = contacts.removeLast();
                        System.out.println("Remove last contact "+removedLast);
                    }else{
                        System.out.println("No contact to remove ");
                    
                    }
                    break;
                case 5:
                    if (!contacts.isEmpty()){
                        System.out.println("List of Contacts ");
                        for (Contact contact : contacts ){
                            System.out.println(contact);
                        }
                    }else{
                        System.out.println("No contact found ");
                    }
                    break;
                    
                case 6:
                    System.out.print("Enter contact name: ");
                    String namePosition = scanner.nextLine();
                    System.out.print("Enter contact Phone Number: ");
                    String phonePosition = scanner.nextLine();
                    System.out.println("Enter the position to add 0-index");
                    int position = scanner.nextInt();
                    
                    if (position >= 0 && position <= contacts.size()){
                        contacts.add(position, new Contact (namePosition,phonePosition));
                        System.out.println("Contact added at position ."+position);

                    }else{
                        System.out.println("Invalid position");
                    }
                    break;
                case 7:
                    System.out.println("Enter name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    boolean removed = contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(nameToRemove));
                    if (removed){
                        System.out.println("Contact Removed ");
                    }else{
                        System.out.println("Contact not found ");
                    }
                    
                    
                    break;
                case 8:
                    System.out.println("Enter the position to add 0-index");
                    int removePosition = scanner.nextInt();
                   
                    if (removePosition >= 0 && removePosition <= contacts.size()){
                        Contact removedContact = (contacts.remove(removePosition));
                        System.out.println("remove contact at position ."+removePosition);

                    }else{
                        System.out.println("Invalid position");
                    }
                    
                    
                    
                    break;
                case 9:
                    System.out.println("Enter name to search: ");
                    String nameToSearch = scanner.nextLine();
                    boolean found = false;
                    
                    for (Contact contact : contacts){
                        if (contact.getName().equalsIgnoreCase(nameToSearch)){
                            System.out.println("Contact found ");
                            found = true;
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("No Contact found ");
                    }
              
                    break;
                case 10:
                    System.out.println("Exit program");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Option ");
                    break;
            
            
            
            }
            
        }
        
    }
}
