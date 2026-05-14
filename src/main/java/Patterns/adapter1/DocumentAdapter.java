package Patterns.adapter1;

public class DocumentAdapter implements DocumentProcessor {
    private DOCProcessor docProcessor;

    @Override
    public void process() {
        docProcessor.process();
    }
}
