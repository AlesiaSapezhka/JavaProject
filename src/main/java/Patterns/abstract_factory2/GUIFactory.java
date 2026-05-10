package Patterns.abstract_factory2;

public interface GUIFactory {
    Button createButton();
    Window createWindow();
    Menu createMenu();
}
