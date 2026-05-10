package Patterns.abstract_factory2;

public class Main {
    public static void main(String[] args) {

        GUIFactory factory = null;

        String type = "Windows";

        if(type.equals("Mac")){
            factory = new MacFactory();
        } else if(type.equals("Windows")){
            factory = new WindowsFactory();
        }
        factory.createMenu().open();
    }
}
