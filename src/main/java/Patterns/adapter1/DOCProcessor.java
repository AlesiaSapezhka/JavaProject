package Patterns.adapter1;

public class DOCProcessor implements DocumentProcessor {
    @Override
    public void process() {
       System.out.println("Document was converted to DOC format");
    }
}
