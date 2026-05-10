package Patterns.adapter1;

import javax.swing.text.Document;

public class DocumentAdapter {
    public static void main(String[] args) {
        PDFProcessor pdfProcessor = new PDFProcessor();
        DOCProcessor docProcessor = new DOCProcessor();

        pdfProcessor.process();
        docProcessor.process();

    }
}
