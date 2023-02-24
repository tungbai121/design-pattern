package org.example;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render Windows button.");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Windows button click.");
    }
}
