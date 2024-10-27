public class Main {
    public static void main(String[] args) {
        Author LeoTolstoy = new Author("Лев", "Толстой");
        Author AlexanderPushkin = new Author("Александр", "Пушкин");

        Book warAndPeace = new Book("Война и мир", LeoTolstoy, 1876);
        Book RuslanAndLudmila = new Book("Руслан и Людмила", AlexanderPushkin, 1850);

        System.out.println(warAndPeace);
        System.out.println(RuslanAndLudmila);

        RuslanAndLudmila.setPublicationYear(1820);

        System.out.println(RuslanAndLudmila);
    }
}