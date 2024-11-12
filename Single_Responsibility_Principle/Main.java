public class Main {
    public static void main(String[] args) {
        // Create a book instance
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "In my younger and more vulnerable years...");

        // Create a BookPrinter instance
        BookPrinter printer = new BookPrinter();

        // Print the book content to the console
        printer.printToConsole(book);

        // Print the book content to a file
        printer.printToFile(book, "book.txt");
    }
}