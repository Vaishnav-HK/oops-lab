public class bookConOverload {
    public static void main(String[] args) {
        Book b1 = new Book("The Invisible Man");
        Book b2 = new Book("Harry Potter", "J K Rowling");

        b1.display();
        b2.display();
    }
}

class Book {
    String title;
    String author;

    Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}


