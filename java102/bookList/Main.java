package java102.bookList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Kitap 1", 200, "Yazar 1", LocalDate.now().minusYears(1)));
        books.add(new Book("Kitap 2", 150, "Yazar 2", LocalDate.now().minusYears(2)));
        books.add(new Book("Kitap 3", 220, "Yazar 3", LocalDate.now().minusYears(3)));
        books.add(new Book("Kitap 4", 330, "Yazar 4", LocalDate.now().minusYears(4)));
        books.add(new Book("Kitap 5", 88, "Yazar 5", LocalDate.now().minusYears(5)));
        books.add(new Book("Kitap 6", 369, "Yazar 6", LocalDate.now().minusYears(6)));
        books.add(new Book("Kitap 7", 422, "Yazar 7", LocalDate.now().minusYears(7)));
        books.add(new Book("Kitap 8", 577, "Yazar 8", LocalDate.now().minusYears(8)));
        books.add(new Book("Kitap 9", 688, "Yazar 9", LocalDate.now().minusYears(9)));
        books.add(new Book("Kitap 10", 202, "Yazar 10", LocalDate.now().minusYears(10)));

        Map<String, String> bookAuthors = new HashMap<>();
        books.forEach(b -> bookAuthors.put(b.getName(), b.getAuthor()));

        bookAuthors.forEach((name, author) -> System.out.println(name + " - " + author));

        bookAuthors.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));

        List<Book> longBooks = books.stream()
                .filter(b -> b.getPageCount() > 100)
                .collect(Collectors.toList());

        longBooks.forEach(book -> {
            System.out.println(book.getName() + " " + book.getAuthor() + " " + book.getPageCount() + " "
                    + book.getPublicationDate());
        });
    }
}
