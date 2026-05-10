package Patterns.adapter1;

public class PDFProcessor implements DocumentProcessor {
    @Override
    public void process() {
     System.out.println("Document was converted to PDF format");
    }
}
