package java102.bookSequencer;

import java.time.LocalDate;

public class Book implements Comparable<Book> {

    private String name;
    private int numberOfPages;
    private String authorName;
    private LocalDate releaseDate;

    public Book(String name, int numberOfPages, String authorName, LocalDate releaseDate) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book b) {
        return this.name.compareTo(b.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

}
