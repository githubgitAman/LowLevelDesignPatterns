package dev.aman.Factory.Menu;

public class IOSMenu implements Menu {
    @Override
    public Menu displayMenu() {
        return new IOSMenu();
    }
}
