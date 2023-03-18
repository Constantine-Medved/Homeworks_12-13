package Homework12;
public class Main {
    public static void main(String[] args) {
        Author authorAlexanderPushkin = new Author("Alexander", "Pushkin");
        Author authorNikolayGogol = new Author("Nikolay", "Gogol");
        Book bookMetel = new Book("Metel", authorAlexanderPushkin, 2020);
        Book bookShinel = new Book("Shinel", authorNikolayGogol, 2017);
        System.out.println("bookShinel.getBookYear = " + bookShinel.getBookYear());
        bookShinel.setBookYear(2020);
        System.out.println("bookShinel.getBookYear = " + bookShinel.getBookYear());
    }
}
