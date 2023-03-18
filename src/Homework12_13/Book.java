package Homework12_13;
public class Book {
    private String bookTitle;
    private Author bookAuthor;
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
}
