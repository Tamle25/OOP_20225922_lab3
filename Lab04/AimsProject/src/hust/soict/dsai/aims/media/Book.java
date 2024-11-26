package Lab04.AimsProject.src.hust.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;
public class Book extends Media{
    private List<String> authors = new ArrayList<String>();
    // Constructor 
    public Book(String title) {
        super(title);
    }
    public Book(String title, String category) {
        super(title, category);
    }
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    // Add author 
    public void addAuthor(String authorName) {
        // kiểm tra xem đối tượng authors có chứa đối tượng authorName ko
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        } 
        else {
            System.out.println("This author has already been in the list!");
        }
    }
    //remove author
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } 
        else {
            System.out.println("No author has been found to remove!");
        }
    }
    @Override
    public String toString() {
        return this.getId() + " - Book: " + this.getTitle() +
                " - Category: " + this.getCategory() +
                " - Cost: " + this.getCost() + "$";
    }

}