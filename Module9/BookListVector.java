
package TN28_Module9;
import java.util.Vector;

public class BookListVector {
    public static void main(String[] args) {
        Vector<String> books = new Vector<>();
        
        //add
        books.add ("Book A");
        books.add ("Book B");
        books.add ("1988");
        
        System.out.println("Book List\n");
        for (String book: books) {
            System.out.println(book);
        }
        
        System.out.println("Remove 1988 book");
        books.remove("1988");
        
        System.out.println("Updated Book List\n");
        for (String book: books) {
            System.out.println(book);
        }
        
        String searchBook = "Book Af";
        if (books.contains(searchBook)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
        
    }

}
