package com.hralievsky.learning.design.patterns.behavioral.command.control;

import com.hralievsky.learning.design.patterns.behavioral.command.commands.Command;

//Invoker
public class Button {
    private final String name;
    private final Command command;

    private Button(String name, Command command) {
        this.name = name;
        this.command = command;
    }

    public void onClick() {
        System.out.println("Button " + name + " clicked");
        command.execute();
        System.out.println("*---------------------*");
    }

    public static Button create(String name, Command command) {
        return new Button(name, command);
    }
}
