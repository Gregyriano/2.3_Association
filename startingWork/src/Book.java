import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    private ArrayList<String> reviews = new ArrayList<>();
    private ArrayList<Double> ratings = new ArrayList<>();


    public Book(String title, String author, int publication){
        this.author = author;
        this.title = title;
        this.publicationYear = publication;
    }

    public int getPublication() {
        return publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setRating(double rating){
        if (rating < 0 || rating > 5){
            System.out.println("Rating is out of bounds.");
        }
        else {
            System.out.println("Rating is set.");
            this.ratings.add(rating);
        }
    }

    public void getRating(){
        for (Double rating : ratings){
            System.out.println(rating);
            System.out.println();
        }
    }

    public void addReview(String review){
        this.reviews.add(review);
    }

    public void getReviews() {
        for (String review : reviews ){
            System.out.println(review);
            System.out.println();
        }
    }

    public double getAverageRating(){
        if (ratings.isEmpty()){
            return 0.0;
        }
        double allratings = 0;
        for (Double rating : ratings){
            allratings += rating;
        }
        return allratings / ratings.size();
    }

    public int getNumberOfReviews(){
        return reviews.size();
    }
}



