package Homework12_13;
import java.util.Objects;
public class Book {
    private final String bookTitle;
    private final Author bookAuthor;
    private int bookYear;
    public Book (String bookTitle, Author bookAuthor, int bookYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
    }
    public String getBookTitle() {
        return this.bookTitle;
    }
    public Author getBookAuthor () {
        return this.bookAuthor;
    }
    public int getBookYear () {
        return this.bookYear;
    }
    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
    /* -------Homework 13 below------- */
    @Override
    public String toString() {
        return "Book title: " + bookTitle + "; " + "author: " + bookAuthor + "; publishing year: " + bookYear + "." ;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookYear == book.bookYear && bookTitle.equals(book.bookTitle) && bookAuthor.equals(book.bookAuthor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, bookAuthor, bookYear);
    }
}
