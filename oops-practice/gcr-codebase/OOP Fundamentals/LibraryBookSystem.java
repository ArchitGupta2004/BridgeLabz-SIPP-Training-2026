public class LibraryBookSystem {
    static class Book {
        String title;
        String author;
        double price;
        boolean availability;

        public Book(String title, String author, double price, boolean availability) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.availability = availability;
        }

        public void borrowBook() {
            if (availability) {
                availability = false;
                System.out.println("You have successfully borrowed '" + title + "'.");
            } else {
                System.out.println("Sorry, '" + title + "' is currently unavailable.");
            }
        }

        public void displayDetails() {
            System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price + ", Available: " + availability);
        }
    }

    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", 45.0, true);
        book.displayDetails();
        
        book.borrowBook();
        book.borrowBook(); // Attempting to borrow again
    }
}
