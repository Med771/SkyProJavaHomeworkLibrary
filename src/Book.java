public class Book {
    // Values
    private final String title;
    private final Author author;
    private int publicationYear;

    // Constructor
    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Get and Set value
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    // Methods
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Publication Year: " + publicationYear;
    }

    @Override
    public boolean equals(Object book) {
        if (this.getClass() != book.getClass()) {
            return false;
        }

        boolean isTitle = title.equals(((Book) book).getTitle());
        boolean isAuthor = author.equals(((Book) book).getAuthor());
        boolean isPublicationYear = publicationYear == ((Book) book).getPublicationYear();

        return isTitle && isAuthor && isPublicationYear;
    }

    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode() + publicationYear;
    }
}
