class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}
class Library {
    int availableBooks;

    Library(int books) {
        availableBooks = books;
    }
    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}
public class pr22 {
    public static void main(String[] args) {
        Library lib = new Library(3);
        try {
            lib.issueBook(2);
            lib.issueBook(2);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Output:
// Book issued successfully
// Requested books not available
