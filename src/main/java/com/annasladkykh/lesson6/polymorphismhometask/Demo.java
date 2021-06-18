package com.annasladkykh.lesson6.polymorphismhometask;

public class Demo {
    public static void main(String[] args) {
        Button button = new Button();
        Button button1 = new Button();
        Label label = new Label();
        Label label1 = new Label();
        CheckBox checkBox = new CheckBox();
        CheckBox checkBox1 = new CheckBox();
        RoundButton roundButton = new RoundButton();
        RoundButton roundButton1 = new RoundButton();
        Component[] components = {button, label, checkBox, roundButton, button1, label1, checkBox1, roundButton1};
        System.out.println("All elements of Component[]");
        for (int i = 0; i < components.length; i++) {
            components[i].draw();
        }
        System.out.println("Only Button and its descendants");
        for (int i = 0; i < components.length; i++) {
            if (components[i] instanceof Button) {
                components[i].draw();
            }
        }

    }
}