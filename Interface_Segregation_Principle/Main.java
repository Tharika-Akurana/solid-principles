interface Printer {
    void print (String document);
}

interface Scanner {
    void scan (String document);
}

interface Fax {
    void fax (String document);
}

// Printer that only prints documents
class SimplePrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }
}

// Multi-function printer that can print, scan and fax
class MultiFunctionPrinter implements Printer, Scanner, Fax {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }
    @Override
    public void scan (String document){
        System.out.println("Scanning document: " + document);
    }
    @Override
    public void fax (String document){
        System.out.println("Faxing document: " + document);
    }
}

// Printer that can only scan documents
class ScannerOnly implements Scanner {
    @Override
    public void scan(String document) {
        System.out.println("Scanning document: " + document);
    }
}

public class Main {
    public static void main(String[] args) {
        Printer simplePrinter = new SimplePrinter();
        simplePrinter.print("MyDocument.txt");

        Scanner scannerOnly = new ScannerOnly();
        scannerOnly.scan("MyScan.txt");

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print("MyDocument.txt");
        mfp.scan("MyScan.txt");
        mfp.fax("MyFax.txt");
    }
}