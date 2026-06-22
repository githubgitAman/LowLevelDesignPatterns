package dev.aman.Factory.Menu;

public class AndroidMenu implements Menu {
    @Override
    public Menu displayMenu() {
        return new AndroidMenu();
    }
}
