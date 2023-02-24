package org.example;

import javax.management.InstanceNotFoundException;

public class Main {
    public static void main(String[] args) throws InstanceNotFoundException {
        MessageService messageService = (MessageService) Injector.getInstance("messageService");
        UserController userController = new UserController(messageService);

        userController.send();
    }
}
