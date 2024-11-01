public class Author {
    // Values
    private final String name;
    private final String surname;

    // Constructors
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Author(String name) {
        this.name = name;
        this.surname = "No surname";
    }

    // Get value
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    // Methods
    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object author) {
        if (this.getClass() != author.getClass()) {
            return false;
        }

        return name.equals(((Author) author).name) && surname.equals(((Author) author).surname);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode();
    }
}
