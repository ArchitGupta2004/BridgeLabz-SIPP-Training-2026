public class BookConstructor {
    static class Book {
        String title;
        String author;
        double price;

        public Book() {
            this.title = "Unknown";
            this.author = "Unknown";
            this.price = 0.0;
        }

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void display() {
            System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
        }
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        defaultBook.display();

        Book customBook = new Book("Java Basics", "John Doe", 29.99);
        customBook.display();
    }
}
