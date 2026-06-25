public class BookLibraryModifiers {
    static class Book {
        public String ISBN;
        protected String title;
        private String author;

        public Book(String ISBN, String title, String author) {
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }

    static class EBook extends Book {
        public EBook(String ISBN, String title, String author) {
            super(ISBN, title, author);
        }

        public void displayEBookInfo() {
            System.out.println("ISBN (public): " + ISBN);
            System.out.println("Title (protected): " + title);
            System.out.println("Author (private accessed via getter): " + getAuthor());
        }
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("978-3-16-148410-0", "Clean Code", "Robert C. Martin");
        ebook.displayEBookInfo();
        
        System.out.println("\nUpdating Author...");
        ebook.setAuthor("Uncle Bob");
        ebook.displayEBookInfo();
    }
}
