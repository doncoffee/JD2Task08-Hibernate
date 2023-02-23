package by.academy.servlet;

import by.academy.servlet.impl.CreateCommand;
import by.academy.servlet.impl.DeleteCommand;
import by.academy.servlet.impl.ReadCommand;
import by.academy.servlet.impl.UpdateCommand;

import java.util.HashMap;

public enum CommandInvoker {
    CREATE(new CreateCommand()),
    READ(new ReadCommand()),
    UPDATE(new UpdateCommand()),
    DELETE(new DeleteCommand());


    private final Command command;

    CommandInvoker(Command command) {
        this.command = command;
    }

    public static Command define(String command) {
        CommandInvoker commandType = CommandInvoker.valueOf(command.toUpperCase());
        return commandType.command;
    }
}