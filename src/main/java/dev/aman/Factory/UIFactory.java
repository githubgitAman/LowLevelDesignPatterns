package dev.aman.Factory;

import dev.aman.Factory.Button.Button;
import dev.aman.Factory.Menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
}
