import java.util.ArrayList;

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public boolean containsISBN(Book book) {
        boolean result = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBNNumber() == book.getISBNNumber()) {
                return true;
            }
        }
        return result;
    }

    public void addBook(Book book) {
        books.add(book);
    }

}

public class Book {
    private int ISBNNumber;
    private String title;
    private String releaseDate;

    public Book(int ISBNNumber, String title, String releaseDate) {
        this.ISBNNumber = ISBNNumber;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public static void main(String[] args) {
        Library lib = new Library();
        Book book1 = new Book(2200, "Lord of the Strings", "1997/07/06");
        Book book2 = new Book(1100, "Ready Player One", "2005/10/02");
        Book book3 = new Book(9900, "Onskan", "1908/01/06");
        Book book4 = new Book(9900, "Onskan", "1908/01/06");
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);

        System.out.println(lib.containsISBN(book4));


    }

    @Override
    public String toString() {
        return "ISBN Number: " + ISBNNumber + "\n" + "Title: " + title + "\n" +
                "Release date: " + releaseDate + "\n";
    }

    public int getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(int ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
