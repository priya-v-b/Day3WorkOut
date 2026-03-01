class Book {
    private String title;
    private String author;
    private double price;

    Book(String title) {
        this.title = title;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }
}

public class Library {
    public static void main(String[] args) {
        Book b = new Book("Java", "James", 500);
        b.display();
    }
}