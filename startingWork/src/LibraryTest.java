
public class LibraryTest {

    public static void main(String[] args) {
        Book pidorvparke = new Book("Hyesosnya", "Pidor", 2025);
        Book chlen = new Book("Penisi", "Pidor", 2023);
        Book Xyi = new Book("Jopi", "Xyesos", 2019);
        Book Siski = new Book("Anysi", "Xyesos", 2002);
        Book Papiros = new Book("Cennosti", "Ochkoshnik", 2003);

        Library library = new Library();

        Siski.setRating(3.5);

        library.addItem(pidorvparke);
        library.addItem(chlen);
        library.addItem(Xyi);
        library.addItem(Siski);
        library.addItem(Papiros);

        library.displayBooks();
        library.borrowBook("Jopi");
        System.out.println();
        library.displayBooks();
        library.returnBook(Xyi);


        System.out.println("Book with title 'Jopi' available? " + library.isBookAvailable("jopi"));
        System.out.println("Ratings of book 'Siski' are: ");
        Siski.getRating();
        Siski.setRating(4);
        Siski.setRating(5);
        Siski.setRating(4);
        Siski.setRating(1);
        Siski.setRating(2);
        Papiros.setRating(1);
        Papiros.setRating(2.25);
        Papiros.setRating(3.7);
        Papiros.setRating(4.2);
        Papiros.setRating(5);
        Papiros.setRating(1.43);


        System.out.println("Rating of book 'Siski' is: ");
        Siski.getRating();
        Siski.addReview("Ну прям ахуенная книга.");
        Siski.addReview("Ну прям невъебически ахуенная книга.");
        Papiros.addReview("Рот того манал какая прекрасная книга");
        Papiros.addReview("Застрелил соседа, чтобы прочитать эту книгу))");
        Papiros.addReview("фворадлофывралдфывраолфывралоыв");
        Xyi.addReview("цвроолфырвалофыврафыварфыволарлыфво");
        System.out.println("All reviews of book Siski: ");
        Siski.getReviews();

        System.out.println("Average rating of book Siski: " + Siski.getAverageRating());
        System.out.println("Average rating of book chlen: " + chlen.getAverageRating());

        System.out.println("Number of reviews of book Siski: " + Siski.getNumberOfReviews());
        System.out.println("------------------------------------");
        User adin = new User("Chlenosos", 23);
        User dva = new User("Pipiskis", 18);
        User tri = new User("Sosiskis", 17);
        User chetire = new User("Trdelnik", 38);
        User piat = new User("Pupirka", 13);
        User shest = new User("Troechnik", 35);
        User sem = new User("Kalitka", 19);


        library.addUser(adin);
        library.addUser(dva);
        library.addUser(tri);
        library.addUser(chetire);
        library.addUser(piat);
        library.addUser(shest);
        library.addUser(sem);
        library.displayUsers();
        System.out.println("-----------------");
        library.removeUser("Kalitka", 19);
        library.removeUser("Troechnik", 35);
        library.displayUsers();
        adin.borrowBook(library, "Cennosti");
        library.displayBooks();
        System.out.println("------------------------------------");
        library.displayBooksBorrowedBooks(adin);
        adin.returnBook(library, "Cennosti");
        library.displayBooks();
        System.out.println("------------------------------------");
        library.displayBooksBorrowedBooks(adin);

        System.out.println("Average rating of Anysi: " + Siski.getAverageRating());
        System.out.printf("Average rating of Cennosti: %.2f%n", Papiros.getAverageRating());

        System.out.printf("Average rating of all books in library: %.2f%n", library.getAverageBookRating());

        System.out.println("Book with most reviews: " + library.getMostReviewBook().getTitle());

        dva.borrowBook(library, "Hyesosnya");
        dva.borrowBook(library, "Penisi");
        tri.borrowBook(library, "Jopi");


        library.findUserByName("Chlenosos", 23);
        System.out.println("List of borrowed books by " + dva.getName() + ".");
        library.listOfBorrowedBooks(dva);
        System.out.println("List of borrowed books by " + tri.getName() + ".");
        library.listOfBorrowedBooks(tri);

    }
}
