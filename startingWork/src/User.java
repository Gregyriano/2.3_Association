import java.util.ArrayList;

public class User {
    private String name;
    private int age;

    ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){return name;}
    public int getAge(){return age;}

    public void borrowBook(Library library, String title) {
        Book book = library.borrowBook(title);
        
        if (book != null) {
            this.borrowedBooks.add(book);
            System.out.println("Book is borrowed: " + book.getTitle());
        } else {
            System.out.println("Could not borrow '" + title + "' (not available in library).");
        }
    }

    public void returnBook(Library library, String title){
        Book bookToReturn = null;
        for (Book book : borrowedBooks){
            if (book.getTitle().equalsIgnoreCase(title)){
                bookToReturn = book;
            }
        }
        borrowedBooks.remove(bookToReturn);
        library.returnBook(bookToReturn);
    }
}
