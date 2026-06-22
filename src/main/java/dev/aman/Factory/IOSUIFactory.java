package dev.aman.Factory;

import dev.aman.Factory.Button.Button;
import dev.aman.Factory.Button.IOSButton;
import dev.aman.Factory.Menu.IOSMenu;
import dev.aman.Factory.Menu.Menu;

public class IOSUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
