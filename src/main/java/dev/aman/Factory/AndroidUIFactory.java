package dev.aman.Factory;

import dev.aman.Factory.Button.AndroidButton;
import dev.aman.Factory.Button.Button;
import dev.aman.Factory.Menu.AndroidMenu;
import dev.aman.Factory.Menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
