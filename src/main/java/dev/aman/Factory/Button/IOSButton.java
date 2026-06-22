package dev.aman.Factory.Button;

public class IOSButton implements Button {
    @Override
    public Button displayButton() {
        return new IOSButton();
    }
}
