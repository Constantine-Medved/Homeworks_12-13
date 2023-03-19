package Homework12_13;
public class Main {
    public static void main(String[] args) {
        Author authorAlexanderPushkin = new Author("Alexander", "Pushkin");
        Author authorNikolayGogol = new Author("Nikolay", "Gogol");
        Book bookMetel = new Book("Metel", authorAlexanderPushkin, 2020);
        Book bookShinel = new Book("Shinel", authorNikolayGogol, 2017);
        System.out.println("bookShinel.getBookYear = " + bookShinel.getBookYear());
        bookShinel.setBookYear(2019);
        System.out.println("bookShinel.getBookYear = " + bookShinel.getBookYear());
        /* -------Homework 13 below------- */
        System.out.println("-------Homework 13 below-------");
        Author authorAlexanderPushkinDuplicate = new Author("Alexander", "Pushkin");
        Book bookShinelDuplicate = new Book("Shinel", authorNikolayGogol, 2019);
        System.out.println(bookMetel);
        System.out.println(bookShinel);
        System.out.println("(authorAlexanderPushkin.hashCode() == authorAlexanderPushkinDuplicate.hashCode()) :"
                + (authorAlexanderPushkin.hashCode() == authorAlexanderPushkinDuplicate.hashCode()));
        System.out.println("(authorAlexanderPushkin.equals(authorAlexanderPushkinDuplicate) :"
                + authorAlexanderPushkin.equals(authorAlexanderPushkinDuplicate));
        System.out.println("(authorAlexanderPushkin.hashCode() == authorNikolayGogol.hashCode()) :"
                + (authorAlexanderPushkin.hashCode() == authorNikolayGogol.hashCode()));
        System.out.println("(bookShinel.hashCode() == bookShinelDuplicate.hashCode()) :"
                + (bookShinel.hashCode() == bookShinelDuplicate.hashCode()));
        System.out.println("(bookShinel.equals(bookShinelDuplicate)): "
                + bookShinel.equals(bookShinelDuplicate));
        System.out.println("(bookMetel.hashCode() == bookShinel.hashCode()): "
                + (bookMetel.hashCode() == bookShinel.hashCode()));
    }
}
