package dev.aman.Factory.Button;

public class AndroidButton implements Button {
    @Override
    public Button displayButton() {
        return new AndroidButton();
    }
}
