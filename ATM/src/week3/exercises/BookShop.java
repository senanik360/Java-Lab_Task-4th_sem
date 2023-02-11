package week3.exercises;

public class BookShop {

    private String title;
    private String author;
    public int id = 111;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
       
        return "Book ID: "+id+"\nBook title: "+getTitle() + "\nBook author: " + getAuthor();

    }

   
}
