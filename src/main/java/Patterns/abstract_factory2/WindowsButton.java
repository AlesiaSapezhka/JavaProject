package Patterns.abstract_factory2;

public class WindowsButton implements Button {
    @Override
    public void clickButton() {
        System.out.println("Click Windows button");
    }
}
