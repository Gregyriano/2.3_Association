import java.util.ArrayList;

public class Library {
    ArrayList<Book> books  = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    public void displayBooks(){
        for (Book book : books){
            System.out.printf(book.getTitle() + " " + book.getAuthor() + " " + book.getPublication());
            System.out.println("\n");
        }
    }

    public void addItem(Book book){
        books.add(book);
    }

    public void findBookByAuthor(String author){
        for (Book book : books){
            if (author.equalsIgnoreCase(book.getAuthor()) ){
                System.out.println("Title is: " + book.getTitle() + ". Year of publication is: " + book.getPublication());
            }
        }
    }

    public Book borrowBook (String title){
        for (Book book : books){
            if (title.equalsIgnoreCase(book.getTitle())){
                System.out.println("Book borrowed : " + book.getTitle());
                books.remove(book);
                return book;
            }
        }
        System.out.println("Book not found: " + title);
        return null;
    }

    public void returnBook(Book book){
        if (!books.contains(book) && book != null){
            books.add(book);
            System.out.println("Book returned: " + book.getTitle());
        }
    }

    public boolean isBookAvailable(String title){
        for (Book book : books){
            if (title.equalsIgnoreCase(book.getTitle())){
                System.out.println("Book is avaliable: ");
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating(){
        double ratingsum  =  0;
        int counter = 0;

        for (Book book : books){
            if (book.getAverageRating() > 0) {
                ratingsum += book.getAverageRating();
                counter++;
            }
        }
        if (counter == 0){
            return 0.0;
        }

        return ratingsum / counter;
    }

    public Book getMostReviewBook(){
        Book mostreviewed = books.get(0);

        for (Book book : books){
            if (book.getNumberOfReviews() > mostreviewed.getNumberOfReviews()){
                mostreviewed = book;
            }
        }
        return mostreviewed;
    }


    public void displayBooksBorrowedBooks(User user){
        for (Book book : user.borrowedBooks){
            System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getPublication());
            System.out.println("\n");
        }
    }

    public void addUser(User user){
        users.add(user);
    }

    public User removeUser (String name,int age){
        for (User user : users){
            if (name.equalsIgnoreCase(user.getName()) && age == user.getAge()){
                System.out.println("User removed : " + user.getName());
                users.remove(user);
                return user;
            }
        }
        System.out.println("User not found: " + name);
        return null;
    }

    public void findUserByName(String name, int age){
        for (User user : users){
            if (name.equalsIgnoreCase(user.getName()) && age == user.getAge()){
                System.out.println("Name is: " + user.getName() + ". Age is:  " + user.getAge());
            }
        }
    }
    public void listOfBorrowedBooks(User user){
        for (Book book : user.borrowedBooks){
            if (book != null) {
                System.out.println("Title is: " + book.getTitle() + ". Year of publication is: " + book.getPublication());
                System.out.println();
            }
        }
    }

    public void displayUsers(){
        for (User user : users){
            System.out.println("Name is: " + user.getName() + ". Age is: " + user.getAge());
        }
    }




}
