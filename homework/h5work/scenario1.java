import java.util.ArrayList;
class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println();
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}

public class scenario1 {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("The Alchemist", "Paulo Coelho", "9780061122415");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "9780132350884");
        Book book3 = new Book("Atomic Habits", "James Clear", "9780735211292");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("\n Displaying All Books ");
        library.displayAllBooks();

        System.out.println("\nSearching for a Book ");
        Book foundBook = library.searchByTitle("Clean Code");

        if (foundBook != null) {
            System.out.println("Book Found!");
            foundBook.displayBook();
        } else {
            System.out.println("Book not found!");
        }
    }
}
