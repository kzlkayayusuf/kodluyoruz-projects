package java102.bookSequencer;

import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Dune", 688, "Frank Herbert", LocalDate.of(1965, Month.AUGUST, 7));
        Book book2 = new Book("Anna Karenina", 864, "Leo Tolstoy", LocalDate.of(1877, Month.NOVEMBER, 9));
        Book book3 = new Book("Don Quixote", 292, "Miguel de Cervantes", LocalDate.of(1615, Month.OCTOBER, 11));
        Book book4 = new Book("The Fellowship of the Ring", 496, "J.R.R. Tolkien",
                LocalDate.of(2000, Month.FEBRUARY, 28));
        Book book5 = new Book("The Grapes of Wrath", 464, "John Steinbeck", LocalDate.of(1939, Month.APRIL, 14));

        Set<Book> books = new TreeSet<>();
        books.add(book1);
        books.add(book3);
        books.add(book4);
        books.add(book2);
        books.add(book5);

        System.out.println("#############Comparable With Book Name#############");

        for (Book b : books) {
            System.out.println(
                    b.getName() + "\t" + b.getAuthorName() + "\t" + b.getNumberOfPages() + "\t"
                            + b.getReleaseDate());
        }

        Set<Book> bSet = new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book b1, Book b2) {
                return b1.getNumberOfPages() - b2.getNumberOfPages();
            }

        }.reversed());

        bSet.addAll(books);

        System.out.println("#############Comparator With Book Number Of Pages#############");

        for (Book b : bSet) {
            System.out.println(
                    b.getNumberOfPages() + "\t" + b.getAuthorName() + "\t" + b.getName() + "\t"
                            + b.getReleaseDate());
        }

    }
}
