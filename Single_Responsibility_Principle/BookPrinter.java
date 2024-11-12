public class BookPrinter {
    // Method to print book content to the console
    public void printToConsole(Book book){
    System.out.println("Title:" + book.getTitle());
    System.out.println("Author:" + book.getAuthor());
    System.out.println("Content:" + book.getContent());
    }

    // Method to print book content to a file
    public void printToFile(Book book,String filename){
        try (java.io.PrintWriter out = new java.io.PrintWriter(filename)) {
            out.println("Title: " + book.getTitle());
            out.println("Author: " + book.getAuthor());
            out.println("Content: " + book.getContent());
            System.out.println("Book content saved to " + filename);
        } catch (java.io.IOException e) {
            System.out.println("An error occured while writting to file: " + e.getMessage());
        }
    }
}