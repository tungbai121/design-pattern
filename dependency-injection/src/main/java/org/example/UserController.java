package org.example;

public class UserController {
    private final MessageService messageService;

    public UserController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send() {
        messageService.sendMessage("Hello Dependency Injection pattern");
    }
}
