package Patterns.adapter1;

public class PDFAdapter implements DocumentProcessor{
    private PDFProcessor pdfProcessor;

    @Override
    public void process() {
        pdfProcessor.process();
    }
}
